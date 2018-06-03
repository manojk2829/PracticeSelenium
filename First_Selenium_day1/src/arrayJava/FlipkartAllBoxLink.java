package arrayJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAllBoxLink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\ChromeDriver\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com");
		WebElement Box= driver.findElement(By.xpath("//div[@class='_1tz-RS']"));
		List <WebElement> links = Box.findElements(By.tagName("a"));
		System.out.println("Number of link in BOX -- " + links.size());
		System.out.println("--------------------------");
		
		for(int i=0;i<links.size();i++){
		System.out.println("link Text -- " + links.get(i).getText());
		links.get(i).click();
		System.out.println("--------------------------");
		driver.get("http://www.flipkart.com");
		Box= driver.findElement(By.xpath("//div[@class='_1tz-RS']"));
		links = Box.findElements(By.tagName("a"));
		}
		driver.get("http://www.flipkart.com");
		Box= driver.findElement(By.xpath("//div[@class='_1tz-RS']"));
		links = Box.findElements(By.tagName("a"));
		WebElement linkThree = links.get(2);
		System.out.println(" "+ linkThree.getText());
		linkThree.click();
		System.out.println("--------------------------");
	}

}
