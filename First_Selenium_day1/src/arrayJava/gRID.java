package arrayJava;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class gRID {
	RemoteWebDriver rw;
	public DesiredCapabilities cap;
	@Test(dataProvider="getdata")
	public void login_Grid(String b) throws MalformedURLException{
         cap =null;
         if(b.equals("chrome")){
        	 cap = DesiredCapabilities.chrome();
             cap.setBrowserName(b);
             cap.setPlatform(Platform.WINDOWS);
         }
         
         else if(b.equals("firefox")){
        	 cap = DesiredCapabilities.firefox();
             cap.setBrowserName(b);
             cap.setPlatform(Platform.WINDOWS);
         }
         rw = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
         rw.manage().window().maximize();
         rw.get("http://care.d2h.com/cms/");
	}
	
	@AfterTest
	public void tear() throws Exception{
		if(rw!=null){
			Thread.sleep(3000);
			rw.quit();
		}
	}
	
	@DataProvider
	public Object[][] getdata(){
		Object[][] data = new Object[2][1];
		data[0][0]="chrome";
		data[1][0]="firefox";
		return data;
	}
}
