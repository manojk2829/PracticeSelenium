package arrayJava;

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
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import JulyUTIL.Xls_Reader;

public class Base_Demo_Test{
	public WebDriver dr;
	public Properties pro;
	public Xls_Reader xls;
	public ExtentReports ext = Ex_Manager_Reporting.ex_reporting_Manager();
	public ExtentTest test;
	public void init(){
		if(pro==null){
			pro=new Properties();
			try{
				FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\src\\SeleniumDemo_Site_Prectice\\co.properties");
				pro.load(fs);
			}catch(Exception ex){System.out.println(ex.getMessage());}
		}
		System.out.println(pro.getProperty("appurl"));
	}
	public void waitForSec(int sec){
		try{
			Thread.sleep(sec*1000);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public void open(String b){
		if(b.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", pro.getProperty("Browser_exe"));
			dr = new ChromeDriver();
		}else{
			dr = new FirefoxDriver();
		}
		test.log(LogStatus.INFO,"Browser Initialization Done.....");
	}
	
	public void navigate(String url){
		test.log(LogStatus.INFO,"URL going to Inter in Browser...." + url);
		dr.get(pro.getProperty(url));
	}
	
	public void input(String loc,String d){
		test.log(LogStatus.INFO,"Enter the Data in Text box...." + "Selected locator --- > " + loc + "     "+ d);
		getElement(loc).sendKeys(d);
	}
	
	public void clickBTN(String loc){
		getElement(loc).click();
	}
	
	public void Select(String loc,String d){
		Select selctValue = new Select(getElement(loc));
		selctValue.selectByVisibleText(pro.getProperty(d));
		test.log(LogStatus.INFO,"Data selected from Drop down list....");
	}
	
	public WebElement getElement(String locetor){
		WebElement w=null;
		if(locetor.endsWith("_id")){
			w=dr.findElement(By.id(pro.getProperty(locetor)));
		}else if(locetor.endsWith("_name")){
			w=dr.findElement(By.name(pro.getProperty(locetor)));
		}else if(locetor.endsWith("_xpath")){
			w=dr.findElement(By.xpath(pro.getProperty(locetor)));
		}else{
			reprotFail("Somthing went Wrong");
		}
		return w;
	}
	public void reprotFail(String msg){
		System.out.println("Report Fail funcation call.....");
	}
	
	public void screenShot(){
		Date d = new Date();
		String fileName = d.toString().replace(" ", "_").replace(":", "_")+".png";
		File src = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		try{
			FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"//report//"+fileName));
		}catch(Exception ex){System.out.println(ex.getMessage());}
		test.log(LogStatus.INFO, "Screen Shot ---- > " + test.addScreenCapture(System.getProperty("user.dir")+"//report//"+fileName));
	}
	

}
