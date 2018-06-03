package arrayJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextBoxClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "//ChromeDriver//ChromeDriver.exe");
		WebDriver ff = new ChromeDriver();
		ff.get("http://gmail.com");
		ff.manage().window().maximize();
		Thread.sleep(4000);

		String TextValue = ff.findElement(By.name("Email")).getAttribute("placeholder");
		System.out.println("User Name --- " + TextValue);
		
		ff.findElement(By.name("Email")).sendKeys("careadmin1");
		ff.findElement(By.name("Email")).clear();
		TextValue = ff.findElement(By.name("signIn")).getAttribute("value");
		System.out.println(" Value of button --- " +  TextValue);
		
		String BannerText = ff.findElement(By.xpath("//div[@class='banner']/h1")).getText();
		System.out.println(BannerText);
		
		ff.quit();
	
		WebDriver bbc = new FirefoxDriver();
		bbc.get("http://google.com/");
		bbc.manage().window().maximize();
		Thread.sleep(3000);
        //Getting Total number of Link on web page --- 
		List<WebElement> links = bbc.findElements(By.tagName("a"));
		System.out.println("Total number of Links on page -- " + links.size());
		
		for(int i = 0; i<links.size();i++){
			System.out.println(links.get(i).getText() + "  ------ >   " + links.get(i).isDisplayed());
		}
	}

}
