package arrayJava;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import JulyUTIL.Xls_Reader;

public class calling_Pro extends Base_July{
	String testCaseName = "Add_Muti_Room_Cust";
	@Test(dataProvider="getExcelData")
	public void login(Hashtable<String,String> data){
	if(data.get("Runmode").equals("N")){
			test.log(LogStatus.SKIP, "Skip the Test...");
			throw new SkipException("Skip the Test...");
		}
        test = ext.startTest("calling_Pro");
        test.log(LogStatus.INFO,"login");
		openBro(pro.getProperty("Browser"));
		navigate(data.get("URL"));
		input("user_id", pro.getProperty("userlogin"));
		input("pass_id", pro.getProperty("userPass"));
		waitForSec(3);
		Screenshot();
		clickBTN("login_xpath");
		System.out.println(dr.getTitle());
	}

	@AfterTest
	public void tearDown(){
	  ext.endTest(test);
	  ext.flush();
	  if(dr!=null){
		  waitForSec(5);
		  dr.quit();
	  }
	}
	
	@DataProvider
	public Object[][] getExcelData(){
		in();
		xls = new Xls_Reader(pro.getProperty("Excel"));
		return ExcelUtilData.getExcelData(xls, testCaseName);
	}
}
