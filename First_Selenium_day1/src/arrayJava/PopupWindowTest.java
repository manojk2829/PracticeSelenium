package arrayJava;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PopupWindowTest {
	WebDriver driver;
  @Test
  @Parameters("browser")
  public void PopupWindow(String browsername) throws InterruptedException{
	  if (browsername.equalsIgnoreCase("chrome")){
		  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver\\ChromeDriver.exe");
		  driver = new ChromeDriver();
	  }
	  else if(browsername.equalsIgnoreCase("firefox")){
		  driver = new FirefoxDriver();
		  driver.get("http://executeautomation.com/demosite/index.html");
	  }
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get("http://executeautomation.com/demosite/index.html");
	  Select ListTitel = new Select(driver.findElement(By.xpath("//select[@id='TitleId']")));
	  ListTitel.selectByIndex(1);
	  driver.findElement(By.id("FirstName")).sendKeys("Manoj");
	  WebElement radioG = driver.findElement(By.name("Female"));
	  if(!radioG.isSelected()){
		  radioG.click();
	  }
	  driver.findElement(By.name("Hindi")).click();
	  System.out.println(driver.getTitle());
	  Thread.sleep(2000);
	  List <WebElement> links = driver.findElements(By.tagName("a"));
	  System.out.println(links.size());
	  for(int i=0;i<links.size();i++){
		  System.out.println(links.get(i).getText());
	  }
	  driver.findElement(By.xpath("//input[@value='Generate']")).click();
	  String MessageTest = driver.switchTo().alert().getText();
	  System.out.println(MessageTest);
	  driver.switchTo().alert().accept();
	  Thread.sleep(2000);
	  driver.switchTo().alert().accept();
	  String ExpectedMessage = "You generated a Javascript alert";
	  Assert.assertEquals(MessageTest, ExpectedMessage);
	  System.out.println("Both Message has same");
	  driver.findElement(By.linkText("HtmlPopup ")).click();
	
	  for(String WindowName : driver.getWindowHandles())
	  {
		  driver.switchTo().window(WindowName);		  
	  }
		driver.manage().window().maximize();
		Select DropDownList = new Select (driver.findElement(By.xpath("//select[@name='TitleId']")));
		DropDownList.selectByIndex(1);
		driver.findElement(By.id("Initial")).sendKeys("One");
		driver.findElement(By.id("FirstName")).sendKeys("Manoj");
		
		WebElement radioGender1 = driver.findElement(By.xpath("//input[@name='Female']"));
		if(!radioGender1.isSelected())
		{
			radioGender1.click();
		}
		Thread.sleep(3000);
		driver.close();
  }
}
