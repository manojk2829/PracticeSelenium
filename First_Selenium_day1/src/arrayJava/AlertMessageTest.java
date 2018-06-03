package arrayJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertMessageTest {
  @Test
  public void AlertTest(){
	 WebDriver driver = new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.get("http://www.ksrtc.in");
	 driver.findElement(By.xpath("//a[contains(.,'Search Services')]")).click();
	 String actual_msg = driver.switchTo().alert().getText();
	 System.out.println(actual_msg);
	 String Expected_msg = "'From' place is required.";
	 Assert.assertEquals(actual_msg, Expected_msg);
	 driver.switchTo().alert().accept();
	 System.out.println(driver.getTitle());
	 
	 driver.quit();
	 
	 
  }
}
