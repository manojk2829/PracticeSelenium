package arrayJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartBoxLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver\\ChromeDriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.flipkart.com");
		d.manage().window().maximize();
		WebElement Box= d.findElement(By.xpath("//div[@class='_1tz-RS']"));
		System.out.println("---" + Box.getText());
		
		System.out.println("---------------------------------");
			
		List <WebElement> link= Box.findElements(By.tagName("a"));
		System.out.println("No of Link ------" + link.size());
		for(int i=0;i<link.size();i++){
			System.out.println(link.get(i).getText());
        
			link.get(i).click();
			System.out.println("------------------------");
			d.get("http://www.flipkart.com");
			Box= d.findElement(By.xpath("//div[@class='_1tz-RS']"));
			link= Box.findElements(By.tagName("a"));
		}
	}
}
