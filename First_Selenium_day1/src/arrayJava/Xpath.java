package arrayJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Xpath {
     @Test
     public void DXpath(){
    	 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromeDriver\\ChromeDriver.exe");
    	 WebDriver driver = new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.get("http://demosite.center/wordpress/wp-admin/");
    	 
    	 driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("admin");
    	 driver.findElement(By.xpath("//label[@for='user_login']/following::input[1]")).sendKeys("demo123");
    	 driver.findElement(By.name("rememberme")).click();
    	 String Link_Test = driver.findElement(By.xpath("//input[@id='user_login']/following::a")).getText();
    	 System.out.println(Link_Test);
    	 driver.findElement(By.name("wp-submit")).click();
    	
    	 
    	 
    	 
     }
}
