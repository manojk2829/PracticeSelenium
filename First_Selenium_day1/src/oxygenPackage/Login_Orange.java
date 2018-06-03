package oxygenPackage;

import java.util.Hashtable;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ExcelUtil_Reader.ExcelReader_data;
import base_package.Base_DDF;

public class Login_Orange extends Base_DDF {
	
	@Test(dataProvider="getExcelData")
	public void LoginOrange(Hashtable<String,String> TC){
		 test=ext.startTest("Testing Extent Report....");
		 if(TC.get("Runmode").equals("N")) {
			 throw new SkipException("Skip the Tese because Runmode is -- Yes ");
		 }
		 login_Orange_App();
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
	
