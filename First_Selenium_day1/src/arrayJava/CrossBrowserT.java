package arrayJava;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import jxl.Workbook;

public class CrossBrowserT {
	WebDriver driver;
  @Test
  @Parameters("browser")
  public void Cross(String browsern) throws Exception{
	  if(browsern.equalsIgnoreCase("firefox")){
	  driver = new FirefoxDriver();
	  System.out.println("Open Firefox...");
  }
	  else if(browsern.equalsIgnoreCase("chrome")){
	  
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//ChromeDriver//chromedriver.exe");
	  driver = new ChromeDriver();
	  System.out.println("Open Chrome...");
	  }
	  driver.manage().window().maximize();
	  driver.get("http://google.com");
	  driver.quit();
	  System.out.println("WebSide Closed................");
	  File sorce = new File("C:\\Users\\ti01045\\Desktop\\data_28_Dec_15_Selenium.xls");
	  Workbook wb = Workbook.getWorkbook(sorce);
	  String data22 = wb.getSheet(0).getCell(2, 2).getContents();
	  System.out.println(data22);
  	  
  }
}
