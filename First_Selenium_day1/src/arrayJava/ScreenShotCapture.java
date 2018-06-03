package arrayJava;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.Test;

public class ScreenShotCapture {
	WebDriver driver;
@Test
public void screenshot(){
	ProfilesIni allPro = new ProfilesIni();
	FirefoxProfile profileFirefox = allPro.getProfile("default_Manoj");
	driver = new FirefoxDriver(profileFirefox);
	driver.manage().window().maximize();
	driver.get("https://google.com");
	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try{
    // now copy the  screenshot to desired location using copyFile //method
	FileUtils.copyFile(src, new File("C:/Users/ti01045/Desktop/BRD-2016/googleScreenShot.jpg"));
	}
	catch (Exception e)
	 {
	  System.out.println(e.getMessage());
	 }
	System.out.println(driver.getTitle());
}
}
