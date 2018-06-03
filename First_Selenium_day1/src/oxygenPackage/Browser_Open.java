package oxygenPackage;

import java.util.Hashtable;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ExcelUtil_Reader.ExcelReader_data;
import base_package.Base_DDF;

public class Browser_Open extends Base_DDF{
	public Actions act;
	@Test(dataProvider="getExcelData")
	public void openBrowser(Hashtable<String,String> TC) {
		 test=ext.startTest("Testing Extent Report....");
		 if(TC.get("Runmode").equals("N")) {
			 throw new SkipException("Skip the Tese because Runmode is -- Yes ");
		 }
		 openBro(TC.get("Browser"));
		 log.info("Browser open successfully.... " + TC.get("Browser"));
		 navigate(pro.getProperty("appurl"));
		 getTitle_AfterLogin();
		 input_Type("userName_name", TC.get("user"));
		 input_Type("userPass_name", TC.get("password"));
		 Click_BTN_LINK("Login_id");
		 wait(2);
		 screenshot();
		 WebElement BOX_Link=getElement("Header_Box_xpath");
		 List<WebElement> alllink=BOX_Link.findElements(By.tagName("a"));
		 System.out.println(alllink.size());
		 for(int i=0;i<alllink.size();i++) {
			 System.out.println(alllink.get(i).getText());
			 log.info("Header Link text copy ---- > " + alllink.get(i).getText());
		 }
		 log.info("Execution Done.... ");
		 
		 act=new Actions(dr);
		 act.moveToElement(getElement("Header_Admin_id")).perform();
		 act.moveToElement(getElement("User_management_id")).perform();
		 act.moveToElement(getElement("User_Detail_id")).click().build().perform();
		 wait(2);
		 screenshot();
		 
		 
	   }

	@DataProvider
	public Object[][] getExcelData(){
		return ExcelReader_data.getExcelData(xls, sheetName, TestCase_Name);
	}
	
	@AfterTest
	public void teardown() {
		quit_Browser(5);
		ext.endTest(test);
		ext.flush();
    }
}
