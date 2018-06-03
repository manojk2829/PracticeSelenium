package arrayJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalNo_Link {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\ChromeDriver\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");{
			List<WebElement> links = driver.findElements(By.tagName("a"));
			System.out.println("Total number of links on page --- " + links.size());
			System.out.println("-------------------------------------------------------------");
			for(int i=0;i<links.size();i++){
			System.out.println(links.get(i).getText());
			System.out.println("**************************************************************");
			}
			WebElement FifthLink = links.get(4);
			System.out.println(FifthLink.getText());
			FifthLink.click();
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			
			WebElement Box = driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td"));
			List <WebElement> LinksBox = Box.findElements(By.tagName("a"));
			System.out.println("Total no of Links ---- " + LinksBox.size());
			for(int j=0;j<LinksBox.size();j++){
			System.out.println(LinksBox.get(j).getText());
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			}
			
	}
  }
}




