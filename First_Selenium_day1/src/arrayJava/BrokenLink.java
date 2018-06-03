package arrayJava;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLink {

	public static void main(String[] args) {
		 WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("http://newtours.demoaut.com/");
		 List <WebElement> link= driver.findElements(By.tagName("a"));
		 System.out.println(link.size());
		 for(int i=0;i<link.size();i++){
			 WebElement el = link.get(i);
			 String url = el.getAttribute("href");
			 verifyActiveLink(url);
		 }
	 }

	public static void verifyActiveLink(String url) {
		 try{
				URL urll = new URL(url);
				HttpURLConnection httpURLConnection = (HttpURLConnection)urll.openConnection();
				httpURLConnection.setConnectTimeout(3000);
				httpURLConnection.connect();
				if(httpURLConnection.getResponseCode()==200)
				{
					System.out.println(url+"---"+httpURLConnection.getResponseMessage());
				}
					if(httpURLConnection.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
					{
						System.out.println(url+"---"+httpURLConnection.getResponseMessage()+"---"+ HttpURLConnection.HTTP_NOT_FOUND);
				    }
			  }

		catch(Exception e){
			System.out.println("Fail");
			}
		}
}
