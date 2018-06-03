package arrayJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenFrame 
{
	@BeforeTest
	public void start(){
		ChromeOptions op = new ChromeOptions();
	    op.addArguments("--disable-extensions");
	    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//ChromeDriver//chromedriver.exe");
	    driver = new ChromeDriver(op);
		//driver = new FirefoxDriver();
	}

	WebDriver driver;
	@Test (dataProvider="DatadrivenFrameWork")
	public void DatadrivenFrameWork(String username, String Password) throws InterruptedException {
		
	  	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys(username);
		driver.findElement(By.id("user_pass")).sendKeys(Password);
		driver.findElement(By.id("wp-submit")).click();
    }
	@AfterTest
	public void stop(){
		driver.quit();
	}

	@DataProvider(name="DatadrivenFrameWork")
	public Object[][] passdata(){
		Object[][] data = new Object[3][2];
		data[0][0] = "admin1";
		data[0][1] ="admin123";
		
		data[1][0] ="admin";
		data[1][1] ="demo123";
		
		data[2][0] ="admin1";
		data[2][1] ="demo123";
		
		return data;
	}
}
