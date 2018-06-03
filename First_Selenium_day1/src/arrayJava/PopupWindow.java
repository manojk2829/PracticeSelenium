package arrayJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PopupWindow {
	WebDriver driver;
    @Test
    @Parameters("browser")
	public void PopupMessageAlert(String browsername) throws InterruptedException {
		
    	if(browsername.equalsIgnoreCase("chrome"))
    	{
    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
    	}
    	else if(browsername.equalsIgnoreCase("firefox"))
    	{
    		driver = new FirefoxDriver();
    	}
		driver.manage().window().maximize();
		driver.get("http://executeautomation.com/demosite/index.html");
		Select Title=new Select(driver.findElement(By.xpath("//select[@id='TitleId']")));
		Title.selectByIndex(1);
		driver.findElement(By.id("Initial")).sendKeys("One");
		driver.findElement(By.id("FirstName")).sendKeys("Manoj");
		
		WebElement radioGender = driver.findElement(By.xpath("//input[@name='Female']"));
		if(!radioGender.isSelected()){
			radioGender.click();
		}
		driver.findElement(By.xpath("//input[@name='Hindi']")).click();
		
		List <WebElement> Link = driver.findElements(By.tagName("a"));
		System.out.println(Link.size());
		
		for(int i=0;i<Link.size();i++)
		{
			System.out.println(Link.get(i).getText());
		}
		
		// Alert Popup message....
		
		driver.findElement(By.xpath("//input[@value='Generate']")).click();
		String AlertText = driver.switchTo().alert().getText();
		System.out.println(AlertText);
		String Expected = "You generated a Javascript alert";
		System.out.println(Expected);
		
		Assert.assertEquals(AlertText, Expected);
		System.out.println("Alert Message has been same....");
		
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
			
		driver.findElement(By.linkText("HtmlPopup ")).click();
		
		for( String WindowName : driver.getWindowHandles())
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
		
		Select dropdowncountry = new Select(driver.findElement(By.xpath("//select[@name='Country']")));
		dropdowncountry.selectByVisibleText("Singapore");
		driver.quit();
		
	}
  }

