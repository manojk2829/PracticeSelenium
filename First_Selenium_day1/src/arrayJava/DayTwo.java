package arrayJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DayTwo {

	public static void main(String[] args) {
		String browsername = "Chrome";
		WebDriver driver = null;
	
		if(browsername.equals("Chrome"))
		{
			ChromeOptions op = new ChromeOptions();
			op.addArguments("chrome.switch","--disable-extensions");
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver(op);
			driver.get("http://google.com/");
		}
		else if (browsername.equals("Firefox"))
		{
			driver = new FirefoxDriver();
			driver.get("http://paytm.com/");
		}
		else if (browsername.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\IE\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.get("http://amazon.in/");
		}
		System.out.println(driver.getTitle());
	}
}
