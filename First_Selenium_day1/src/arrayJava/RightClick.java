package arrayJava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		WebElement right = driver.findElement(By.linkText("About"));
	try
	{
		Actions act = new Actions(driver);
	    act.moveToElement(right);
	    act.contextClick(right).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ENTER).build().perform();
	}
    catch(Exception e){
    	System.out.print(e);
    }
}
}
