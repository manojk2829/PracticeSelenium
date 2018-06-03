package arrayJava;

import java.util.Date;
import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Ex_Manager_Reporting {
	public static ExtentReports ext;
	public ExtentTest test;
	
	public static ExtentReports ex_reporting_Manager(){
		if(ext==null){
		Date d = new Date();
		String FileName = d.toString().replace(" ", "_").replace(":", "_")+".html";
		ext = new ExtentReports("D://report//"+FileName,true, DisplayOrder.NEWEST_FIRST);
        ext.addSystemInfo("QA","Manoj");
	  }
        return ext;
  }
}
