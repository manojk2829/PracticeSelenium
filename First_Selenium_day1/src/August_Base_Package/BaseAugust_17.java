package August_Base_Package;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Delete_BaseClass.Xls_Reader;

public class BaseAugust_17 {
	public Properties pro;
	public WebDriver dr;
	public ExtentReports ext=Extent_August_Manoj.getReport();
	public ExtentTest test;
	public Xls_Reader xls;
	public void in(){
		pro = new Properties();
		try{
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\August_Base_Package\\or.properties");
			pro.load(fis);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		System.out.println(pro.getProperty("appurl"));
		System.out.println(pro.getProperty("Browser_exe"));
	}
	
	public void openBro(String b){
		if(b.equalsIgnoreCase(b)){
			System.setProperty("webdriver.chrome.driver", pro.getProperty("Browser_exe"));
			dr =new ChromeDriver();
		}else{
			dr = new FirefoxDriver();
		}
		test.log(LogStatus.INFO,"Browser Open --- " + pro.getProperty("Browser"));
	}
	
	public void navigate(String url){
		dr.get(pro.getProperty(url));
	}
	
	public WebElement getElement(String loc){
		WebElement w = null;
		try{if(loc.endsWith("_id")){
			w=dr.findElement(By.id(pro.getProperty(loc)));
		}else if(loc.endsWith("_name")){
			w=dr.findElement(By.name(pro.getProperty(loc)));
		}else if(loc.endsWith("_xpath")){
			w=dr.findElement(By.xpath(pro.getProperty(loc)));
		}else{
			reportFail("Something went wrong...");
		}}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		return w;
	}
	
	public boolean reportFail(String msg){
		    ScreenShot();
			return false;
     }
	
	public void input(String locetor,String data){
		getElement(locetor).sendKeys(data);
		test.log(LogStatus.INFO,"Enter the inpt in Textbox --- " + locetor);
	}
	
	public void click(String locetor){
		getElement(locetor).click();
		test.log(LogStatus.INFO,"Click the button. --- " + locetor);
	}
	
	
	public void ScreenShot(){
		Date d = new Date();
		String fileName = d.toString().replace(" ", "_").replace(":", "_")+".jpg";
		File srcName = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		try{
			FileUtils.copyFile(srcName, new File(System.getProperty("user.dir")+"//report//"+fileName));
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		test.log(LogStatus.INFO, "Take ScreenShot -- > " + test.addScreenCapture(System.getProperty("user.dir")+"//report//"+fileName));
	}

}
