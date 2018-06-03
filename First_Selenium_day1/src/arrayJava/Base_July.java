package arrayJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

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

import JulyUTIL.Xls_Reader;

public class Base_July {
	public Properties pro;
	public WebDriver dr;
	public ExtentReports ext = Ex_manager.getReporting();
	public ExtentTest test;
	public Xls_Reader xls;
	
	public void in(){
		
		if(pro==null){
			pro = new Properties();
			try {
				FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\JulyUTIL\\julyConfig.properties");
				pro.load(fis);
			} catch (Exception e) {	
			   e.printStackTrace();
			   System.out.println(e.getMessage());
			}
		}	
		System.out.println(pro.getProperty("appurl"));
	  }
	
	public void openBro(String b){
		System.setProperty("webdriver.chrome.driver", pro.getProperty("Browser_exe"));
		if(b.equalsIgnoreCase(b)){
			dr = new ChromeDriver();
		}else{
			dr = new FirefoxDriver();					
		}
		System.out.println(pro.getProperty("Browser"));
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void navigate(String URL){
		dr.get(URL);
	}
	
	public WebElement getElement(String locater){
		WebElement w= null;
		if(locater.endsWith("_id")){
			w = dr.findElement(By.id(pro.getProperty(locater)));
		}else if(locater.endsWith("_name")){
			w = dr.findElement(By.name(pro.getProperty(locater)));
		}else if(locater.endsWith("_xpath")){
			w = dr.findElement(By.xpath(pro.getProperty(locater)));
		}else{
			reportFail("Locater not found...");
		}
		return w;
	}
	
	public boolean reportFail(String msg){
		System.out.println(msg);
		Screenshot();
		return false;
	}
	
	public void Screenshot(){
		Date d = new Date();
		String filename=d.toString().replace(" ", "_").replace(":", " ")+".jpg";
		File srcFile = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir")+"//report//"+filename));
		} catch (IOException e) {
			e.printStackTrace();
		}
		test.log(LogStatus.INFO,"Screen Shot taken -- > ", test.addScreenCapture(System.getProperty("user.dir")+"//report//"+filename));
		
	}
	public void input(String loc,String data){
		test.log(LogStatus.INFO, "Insert the value in Text box..." + data);
		getElement(loc).sendKeys(data);
	}
	public void clickBTN(String loc){
		test.log(LogStatus.INFO, "Click the BTN OR LINK.." + loc);
		getElement(loc).click();
	}
	public void waitForSec(int timeSec){
		try{
			Thread.sleep(timeSec * 1000);
		}catch(Exception ex){ex.getMessage();}
	}
	
}
