package arrayJava;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ExampleProgram {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\ChromeDriver\\ChromeDriver.exe");
		WebDriver GC= new ChromeDriver();
		//WebDriver FF=new FirefoxDriver();
		GC.get("http://newtours.demoaut.com/");
		GC.manage().window().maximize();
		GC.findElement(By.name("userName")).sendKeys("qqqq");
		GC.findElement(By.name("password")).sendKeys("qqqq");
		GC.findElement(By.name("login")).click();
		WebElement radiobtn =GC.findElement(By.xpath("//input[@value='oneway']"));
		if (!radiobtn.isSelected())
		{
			radiobtn.click();
		}
		Select Pass = new Select(GC.findElement(By.xpath("//Select[@name='passCount']")));
		Pass.selectByValue("3");
		List <WebElement> links = GC.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		System.out.println(links.get(i).getText());
		GC.close();
	}
}
