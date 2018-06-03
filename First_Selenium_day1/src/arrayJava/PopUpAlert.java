package arrayJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ChromeDriver\\ChromeDriver.exe");
		WebDriver ff = new ChromeDriver();
		ff.get("http://www.ksrtc.in/");	
		ff.manage().window().maximize();
		ff.findElement(By.xpath("//a[@class='button1 redbtn']")).click();
		String Atual_Text = ff.switchTo().alert().getText();
		System.out.println("Popup message --- " + Atual_Text);
		Thread.sleep(3000);

		ff.switchTo().alert().accept();

		List <WebElement> link = ff.findElements(By.tagName("a"));
		System.out.println("all link no. ---- " + link.size());
		System.out.println("------------------------");
		WebElement Box = ff.findElement(By.xpath("//div[7]/ul"));
		System.out.println(Box.getText());
		System.out.println("------------------------");
		List <WebElement> links = Box.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0; i<links.size();i++){
		System.out.println(links.get(i).getText());
		links.get(i).click();
		System.out.println("------------------------");
		ff.get("http://www.ksrtc.in/");
		Box = ff.findElement(By.xpath("//div[7]/ul"));
		links = Box.findElements(By.tagName("a"));
				
		}
	}
}
