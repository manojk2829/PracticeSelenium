package arrayJava;

import java.util.Date;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class Ex_manager {

	public static ExtentReports ext;
	public static ExtentReports getReporting(){
		if(ext == null){
			Date d = new Date();
			String Screen_File = d.toString().replace(":", "_").replace(" ", "_")+".html";
			ext = new ExtentReports("D://report//"+Screen_File, true, DisplayOrder.NEWEST_FIRST);
			ext.addSystemInfo("QA", "172.19.4.194");
		}
		return ext;
	}
}
