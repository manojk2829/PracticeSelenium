package August_Base_Package;

import java.util.Date;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class Extent_August_Manoj {
	public static ExtentReports ext;
	public static ExtentReports getReport(){
		if(ext==null){
			Date d = new Date();
			String fileName = d.toString().replace(" ", "_").replace(":", "_")+".html";
			ext = new ExtentReports("D://report//"+fileName,true,DisplayOrder.NEWEST_FIRST);
			ext.addSystemInfo("QA", "Kushwaha").addSystemInfo("Version", "2.53.1");
		}
		return ext;
	}
}
