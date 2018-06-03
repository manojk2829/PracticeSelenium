package arrayJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "//ChromeDriver//ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.flipkart.com/");
		WebElement Box1 = driver.findElement(By.xpath("//div[@class='_1tz-RS']"));
		System.out.println(Box1.getText());
		List <WebElement> Alllinks = Box1.findElements(By.tagName("a"));
		System.out.println("Total no of Links --- " + Alllinks.size());
		for(int i=0;i<Alllinks.size();i++){
			Alllinks.get(i).click();
			System.out.println("------" +  driver.getTitle());
			driver.get("http://www.flipkart.com/");
			Box1 = driver.findElement(By.xpath("//div[@class='_1tz-RS']"));
			Alllinks = Box1.findElements(By.tagName("a"));
		}
	}
}

