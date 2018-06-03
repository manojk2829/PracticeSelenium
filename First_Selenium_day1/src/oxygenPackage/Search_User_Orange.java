package oxygenPackage;

import java.util.Hashtable;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ExcelUtil_Reader.ExcelReader_data;
import base_package.Base_DDF;

public class Search_User_Orange extends Base_DDF {
	
	@Test(dataProvider="getExcelData")
	public void search_User_BY_Excel(Hashtable<String,String> TC) {
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
