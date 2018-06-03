package arrayJava;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class IfseCode {

	public static void main(String[] args) {
	   //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\ChromeDriver\\ChromeDriver.exe");
       // ChromeDriver ifsc = new ChromeDriver();
		FirefoxDriver ifsc = new FirefoxDriver();
        ifsc.get("http://ifsccodebank.com/");
        ifsc.findElement(By.xpath("//input[@id='BC_ddlBank']"));
	   //select dd1= new select(bank);
       // dd1.selectByVisibleText("Axis Bank");
   
	
	}

}
