package August_Base_Package;

import java.util.Hashtable;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Delete_BaseClass.Xls_Reader;

public class LoginCare extends BaseAugust_17 {
	String testCaseName = "Care_Login_Test";
	@Test(dataProvider="getData")
	public void login(Hashtable<String,String> data){
		test = ext.startTest("Login Care");
		openBro(pro.getProperty("Browser"));
		navigate("appurl");
		ScreenShot();
		input("user_id", data.get("LoginUser"));
		input("pass_id", data.get("Password"));
		click("login_id");
		ScreenShot();
	}
	
	@AfterTest
	public void tearDown(){
		ext.endTest(test);
		ext.flush();
		if(dr!=null){
			try{
				Thread.sleep(3000);
				dr.quit();
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
	}
	@DataProvider
	public Object[][] getData(){
		in();
		xls  = new Xls_Reader(pro.getProperty("ExcelPath"));
		return readUtil_Excel_August.getReadExcel(xls, testCaseName);
	}
}
