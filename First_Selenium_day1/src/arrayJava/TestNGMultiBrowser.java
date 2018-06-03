package arrayJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowser {
WebDriver driver;
@Test
@Parameters("browser")
public void cross(String BrowserName){
	/*if(BrowserName.equalsIgnoreCase("firefox")){
		driver = new FirefoxDriver();
	}
	else if(BrowserName.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver\\ChromeDriver.exe");
		driver = new ChromeDriver();
	}
	else */
	if(BrowserName.equalsIgnoreCase("IE")){
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\IE\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}
	driver.manage().window().maximize();
	driver.get("http://www.google.com/");
	System.out.println(driver.getTitle());
	driver.quit();
}
}
