package arrayJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RightClickTest {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver\\ChromeDriver.exe");
		  WebDriver driver = new ChromeDriver();
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
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[@id='Automation Tools']")).click();
	        driver.findElement(By.id("Selenium RC")).click();   
	}

}
