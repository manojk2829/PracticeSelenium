package arrayJava;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import JulyUTIL.Xls_Reader;

public class RegisterLogin extends Base_Demo_Test{
    String TestCaseName="Test_Case";

	@Test(dataProvider="getData")
	public void loginTest(Hashtable<String,String> data){
		test = ext.startTest("RegisterLogin");
		test.log(LogStatus.INFO,"Test Case Start to Execute....");
		
		if(!UtilDemo.isRunable("AddNewMaterialGroup", xls)||data.get("Runmode").equals("N"))
			throw new SkipException("Test Case Skipped Becauseof RunMode is N ");
		
		if(data.get("Runmmode").equals("N")){
			throw new SkipException("Skip the Test....");
		}
		open(pro.getProperty("Browser"));
		navigate("appurl");
		input("user_name", pro.getProperty("user"));
		input("phone_name", data.get("Phone"));
		Select("country_name", "County");
		System.out.println(dr.getCurrentUrl());
		System.out.println(dr.getTitle());
		screenShot();
	}
	
	@AfterTest
	public void tearDown(){
		ext.endTest(test);
		ext.flush();
		if(dr!=null){
			waitForSec(3);
			dr.quit();
		}
	}
	
	@DataProvider
	public Object[][] getData(){
		init();
		xls=new Xls_Reader(pro.getProperty("excel"));
		return UtilDemo.getData(xls, TestCaseName);
   }
}
