package arrayJava;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindLinks {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://w3schools.com/");
	   List <WebElement> links = driver.findElements(By.tagName("a"));

	 for(int i=0;i<links.size();i++)
	 System.out.println(links.get(i).getText());
	 driver.close();
	 //for(int i=0;i<links.size();i++)
	// {
	// links.get(i).click();
	// driver.close();
	  //      driver.navigate().back();
	}
	}