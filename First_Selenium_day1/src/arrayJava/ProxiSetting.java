package arrayJava;

import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProxiSetting {

	public static void main(String[] args) throws Exception {
		/*String PROXY_Set = "172.19.70.191:8080";
        Proxy proxy = new Proxy();
        proxy.setHttpProxy(PROXY_Set).setFtpProxy(PROXY_Set).setSslProxy(PROXY_Set);
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(CapabilityType.PROXY,PROXY_Set);*/
        WebDriver dr = new FirefoxDriver();
        dr.get("http://executeautomation.com/demosite/index.html");
        System.out.println(dr.getTitle());
        
        Actions act = new Actions(dr);
        act.moveToElement(dr.findElement(By.xpath("//span[@id='Automation Tools']"))).build().perform();
        Thread.sleep(2000);
        WebDriverWait w = new WebDriverWait(dr, 2);
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div/ul/li[2]/ul/li[1]/a/span")));
        act.moveToElement(dr.findElement(By.xpath("html/body/div/ul/li[2]/ul/li[1]/a/span"))).build().perform();
        
        
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div/ul/li[2]/ul/li[1]/ul/li[3]/a/span")));
        act.moveToElement(dr.findElement(By.xpath("html/body/div/ul/li[2]/ul/li[1]/ul/li[3]/a/span"))).build().perform();
        dr.findElement(By.xpath("html/body/div/ul/li[2]/ul/li[1]/ul/li[3]/a/span")).click();
        
        Thread.sleep(8000);
        dr.quit();
	}

}
