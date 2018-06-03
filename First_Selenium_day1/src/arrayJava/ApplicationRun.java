package arrayJava;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ApplicationRun {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("userName")).sendKeys("qqqq");
		driver.findElement(By.name("password")).sendKeys("qqqq");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		System.out.println("Rugister User Login Successfully");
		System.out.println(driver.getTitle());
		
		List <WebElement> AppLinks = driver.findElements(By.tagName("a"));
		System.out.println("Number of Link on Page --- " + AppLinks.size());
		
		for(int i=0;i<AppLinks.size();i++)
		{
		   System.out.println(AppLinks.get(i).getText());
		}
        
		WebElement radio1 = driver.findElement(By.xpath("//input[@value='oneway']"));
		if(!radio1.isSelected()){
			radio1.click();
		}
		
		Select List1 = new Select(driver.findElement(By.xpath("//select[@name='passCount']")));
		List1.selectByVisibleText("2");
		
		Select ListdateDay = new Select(driver.findElement(By.xpath("fromDay")));
		ListdateDay.selectByValue("11");
		
		driver.findElement(By.xpath("//input[@name='findFlights']")).click();
		Thread.sleep(5000);
		
		System.out.println("Page Tittle ---" + driver.getTitle());
	}
}
