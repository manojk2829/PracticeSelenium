package arrayJava;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumAgain {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		String TitleName = driver.getTitle();
		System.out.println("Page Title Name -- " + TitleName );
		driver.quit();
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\ChromeDriver\\Chromedriver.exe");
		WebDriver c = new ChromeDriver();
		c.manage().window().maximize();
		c.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		c.get("http://google.com");
		List <WebElement> AllpageLink = c.findElements(By.tagName("a"));
		System.out.println("---");
		System.out.println("Number of Link on Page ------"+ AllpageLink.size());
		for(int i=0;i<AllpageLink.size();i++){
		String LinkName = AllpageLink.get(i).getText();
		System.out.println("--  " +     LinkName);
		}
		
	}

}
