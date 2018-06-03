package arrayJava;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FF {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\ChromeDriver\\ChromeDriver.exe");
		//ChromeDriver gc=new ChromeDriver();
		
		FirefoxDriver gc = new FirefoxDriver();
		gc.manage().window().maximize();
		gc.get("http://uanmembers.epfoservices.in/");
		Thread.sleep(2000);
		System.out.println(gc.getTitle());
		System.out.println(gc.findElement(By.xpath("//a[text()='Know your UAN Status']")).getText());
		gc.findElement(By.id("username")).sendKeys("100241595969");
		gc.findElement(By.id("password")).sendKeys("bbcl@1234");
		gc.findElement(By.xpath("//input[@class='inputStyle']")).click();
		System.out.println(gc.findElement(By.xpath("//table/tbody/tr[5]/td[2]")).getText());
		gc.findElement(By.linkText("DOWNLOAD")).click();
		Thread.sleep(5000);
		System.out.println(gc.findElement(By.xpath("//span[@class='menubartext']")).getText());		
		gc.findElement(By.xpath("//input[@name='dwnld_pdf']")).click();

		//gc.findElement(By.xpath("//a[text()='LOGOUT']"));
		
	}

}
