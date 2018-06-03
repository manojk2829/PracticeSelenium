package arrayJava;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Radiobutton {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\ChromeDriver\\ChromeDriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
				driver.get("http://newtours.demoaut.com/");
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("qqqq");
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys("qqqq");
				driver.findElement(By.xpath("//input[@name='login']")).click();
				//Thread.sleep(2000);
				WebElement r1 = driver.findElement(By.xpath("//input[@value='oneway']"));				
				WebElement a1 = driver.findElement(By.xpath("//input[@value='Coach']"));
				WebElement a2 = driver.findElement(By.xpath("//input[@value='First']"));
				
				if (!r1.isSelected())
				{
					r1.click();
				}
				Select Passenger = new Select(driver.findElement(By.xpath("//Select[@name='passCount']")));
				Passenger.selectByValue("3");
				//Thread.sleep(2000);
				Select Departing  = new Select(driver.findElement(By.xpath("//Select[@name='fromPort']")));
				Departing.selectByValue("Portland");
				//Thread.sleep(2000);
				Select ON = new Select(driver.findElement(By.xpath("//Select[@name='fromMonth']")));
				ON.selectByVisibleText("August");
				//Thread.sleep(2000);
				Select Day  = new Select(driver.findElement(By.xpath("//Select[@name='fromDay']")));
				Day.selectByValue("10");
				//Thread.sleep(2000);

				if (!a1.isSelected())
				{
					a1.click();
				}
				//Thread.sleep(2000);
				if(!a2.isSelected())
				{
					a2.click();
				}	
				Select Airline  = new Select(driver.findElement(By.xpath("//Select[@name='airline']")));
				Airline.selectByVisibleText("Pangea Airlines");
				//Thread.sleep(2000);
			    driver.findElement(By.xpath("//input[@name='findFlights']")).click();
			   // Thread.sleep(2000);
			    System.out.println(driver.getTitle());
				System.out.println(driver.findElement(By.xpath("//a[text()='SIGN-OFF']")).getText());
			    driver.findElement(By.xpath("//a[text()='SIGN-OFF']")).click();	
				driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("qqqq");
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys("qqqq");
				driver.findElement(By.xpath("//input[@name='login']")).click();
				Thread.sleep(2000);
			    driver.close();
			}
	}

