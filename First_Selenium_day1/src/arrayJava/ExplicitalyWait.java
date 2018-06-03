package arrayJava;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ExplicitalyWait {
	@Test
	public void explicitalywait() throws Exception{
		WebDriver dr = new FirefoxDriver();
		//dr.navigate().to("http://care.d2h.com/cms/");
		dr.manage().deleteAllCookies();
		dr.navigate().to("http://care.d2h.com/cms/");
		
		
		dr.manage().window().maximize();
		System.out.println(dr.manage().window().getSize());
		dr.findElement(By.name("txtUserName")).sendKeys("careadmin1");
        dr.findElement(By.name("txtPassword")).sendKeys("bbcl@gr1");
        dr.findElement(By.name("txtPassword")).sendKeys(Keys.ENTER);
        
        List<WebElement> totalFrame =  dr.findElements(By.tagName("iframe"));
        System.out.println(totalFrame.size());
        
        File src = new File("C:\\Users\\ti01045\\Desktop\\CheckList_HotFix_Environment_7_Feb_17.xlsx");
        FileInputStream fis = new FileInputStream(src);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet st = wb.getSheet("TestData");
        System.out.println(st.getRow(13).getCell(0).getStringCellValue());
        
        FileOutputStream fos = new FileOutputStream(src);
        st.getRow(13).createCell(3).setCellValue(dr.getTitle());
        wb.write(fos);
        fos.close();
        
        List<WebElement> link = dr.findElements(By.tagName("a"));
        System.out.println(link.size());
        for(int i=0;i<link.size();i++){
        	System.out.println(link.get(i).getText());
        }
        
        /*
        WebDriverWait wt = new WebDriverWait(dr, 20);
        wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='lnkLogin']"))).click();
        Thread.sleep(3000);
        dr.findElement(By.name("txtUserName")).sendKeys("careadmin1");
        dr.findElement(By.name("txtPassword")).sendKeys("bbcl@gr1");
        
        wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='btnLogin']"))).click();
        dr.findElement(By.name("txtPassword")).sendKeys(Keys.ENTER);
		
		Select s = new Select(dr.findElement(By.id("TitleId")));
		List<WebElement> sOpation = s.getOptions();
		System.out.println(sOpation.size());
		
					
		//@name='txtUserName'
		WebElement cssValue= dr.findElement(By.name("txtUserName"));
		JavascriptExecutor jse = (JavascriptExecutor) dr;
		jse.executeScript("document.getElementById('txtUserName').value='eeeee Kids'");
		
		JavascriptExecutor se = (JavascriptExecutor)dr;
		se.executeScript("window.scrollBy(0,250)", "");

		
		
		Dimension d = new Dimension(600, 800);
		dr.manage().window().setSize(d);
		
		WebDriverWait wt = new WebDriverWait(dr, 2);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox"))).sendKeys(" Watch");
		dr.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);

		String actualText = dr.getTitle();
		System.out.println(actualText);
		String Expected = "Care D2H";
		SoftAssert st = new SoftAssert();
		st.assertEquals(actualText, Expected);
		
		Assert.assertEquals(actualText, Expected);
		System.out.println("Matching Done.....");
				
*/
		Thread.sleep(5000);
        dr.quit();	
	}
}
