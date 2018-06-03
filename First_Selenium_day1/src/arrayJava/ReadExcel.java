package arrayJava;

import java.io.File;
import jxl.Workbook;


public class ReadExcel {

	public static void main(String[] args) throws Exception {
		File src= new File("C:\\Users\\ti01045\\Desktop\\data_28_Dec_15_Selenium.xls");
		Workbook wb = Workbook.getWorkbook(src);
		String data00 = wb.getSheet(0).getCell(0,0).getContents();
		System.out.println(data00);
		String data12 = wb.getSheet(0).getCell(1,2).getContents();
		System.out.println(data12);
	}

}
