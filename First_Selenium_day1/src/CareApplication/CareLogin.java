package CareApplication;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CareLogin {

	public static void main(String[] args) throws InterruptedException {
		// Open browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://172.19.4.64/TESTING-MR29/CMS/");
		driver.findElement(By.xpath("//input[@id='txtUserName']")).sendKeys("careteststh");
		String myWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(myWindowHandle);
		WebElement email_id= driver.findElement(By.xpath(".//*[@id='txtPassword']"));
		email_id.sendKeys("irctc@116");
		
	}
}

