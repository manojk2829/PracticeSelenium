package arrayJava;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AllLink {
     @Test
	public void AllLinkandAlertMessage(){
		WebDriver ff  = new FirefoxDriver();
		ff.manage().window().maximize();
		ff.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ff.get("http://www.ksrtc.in/");
		String PageName= ff.getTitle();
		System.out.println(PageName);
		String ExpectedPageName = "Book Bus Ticket Online - KSRTC";
		Assert.assertEquals(PageName, ExpectedPageName);
		System.out.println("Page Name verifyed according to Acpected Result....");
		WebElement Box = ff.findElement(By.xpath("//ul[@class='topMenuNav topNavShadow']"));
		System.out.println(Box.getText());
		List <WebElement> Alllink = Box.findElements(By.tagName("a"));
		System.out.println(Alllink.size());
		for(int i=0;i<Alllink.size();i++)
		{
		   System.out.println(Alllink.get(i).getText());
		}
		Alllink = ff.findElements(By.tagName("a"));
		System.out.println(Alllink.size());
		for(int i =0;i<Alllink.size();i++)
		{
			System.out.println(Alllink.get(i).getText());
		}	
		
        ff.findElement(By.xpath("//input[@name='chkLadiesSeatOnly']")).click();
        String CheckBoxMessage = ff.switchTo().alert().getText();
        System.out.println(CheckBoxMessage);
        ff.switchTo().alert().accept();
        ff.findElement(By.xpath("//a[contains(.,'Search Services')]")).click();
        String actual_Result = ff.switchTo().alert().getText();
        System.out.println(actual_Result);
        String Expected_Message = "'From' place is required.";
        Assert.assertEquals(actual_Result, Expected_Message);
        ff.switchTo().alert().accept();
        ff.quit();
	}

}
