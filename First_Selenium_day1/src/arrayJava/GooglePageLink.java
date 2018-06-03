package arrayJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageLink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "//ChromeDriver//ChromeDriver.exe");
		WebDriver ff = new ChromeDriver();
		ff.get("http://google.com");
		ff.manage().window().maximize();
        List <WebElement> link = ff.findElements(By.tagName("a"));
        System.out.println("Number of links --- " + link.size());
        System.out.println("------------------------");
        for(int i=0;i<link.size();i++){
        System.out.println("Link name ---- " + link.get(i).getText());
        System.out.println("------------------------");
       }
       
	}

}
