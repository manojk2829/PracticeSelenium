package arrayJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ErrorMessageValidation {
  @Test
  public void ErrorMessageTest(){
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver\\chromedriver.exe");
	  WebDriver cd = new ChromeDriver();
	  cd.manage().window().maximize();
	  cd.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  cd.get("https://gmail.com");
	  System.out.println("OK........................");
	  cd.findElement(By.xpath("//input[@id='next']")).click();
	  String ActualError = cd.findElement(By.xpath("//span[@id='errormsg_0_Email']")).getText();
	  System.out.println(ActualError);
	  String Expectedmsg = "Please enter your email.";
	  Assert.assertEquals(ActualError, Expectedmsg);
	  System.out.println("Actual is Equale to Expected.....");
	  Assert.assertTrue(ActualError.contains("Please enter your"));
	  
  }
}
