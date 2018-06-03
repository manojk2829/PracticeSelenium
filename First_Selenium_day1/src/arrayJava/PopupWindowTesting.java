package arrayJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PopupWindowTesting {
  WebDriver driver;
	@Test
  public void popup(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://executeautomation.com/demosite/index.html");
		Select title = new Select(driver.findElement(By.xpath("//select[@name='TitleId']")));
		title.selectByIndex(2);
		driver.findElement(By.name("FirstName")).sendKeys("Manoj");
		WebElement radioG = driver.findElement(By.name("Female"));
		if(!radioG.isSelected()){
			radioG.click();
		}
		driver.findElement(By.linkText("HtmlPopup ")).click();
		for(String windowname : driver.getWindowHandles()){
			driver.switchTo().window(windowname);
		}
		driver.findElement(By.id("FirstName")).sendKeys("Kushwaha");
		Select Country = new Select(driver.findElement(By.name("Country")));
		Country.selectByVisibleText("India");
		driver.close();
		driver.quit();
	  
  }
	
}
