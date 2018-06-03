package arrayJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void Multibrowser(String browserName){
		if(browserName.equalsIgnoreCase("Firefox")){
			driver = new FirefoxDriver();
			System.out.println("Firefox browser is getting opened");
		}
		else if(browserName.equalsIgnoreCase("chrome")){
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//ChromeDriver//chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Chrome browser is getting opened");
		}
		driver.manage().window().maximize();
		driver.get("http://google.co.in");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
