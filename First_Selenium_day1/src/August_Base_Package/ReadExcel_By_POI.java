package August_Base_Package;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel_By_POI {

	public static void main(String[] args) throws Exception {
		File srcFile = new File("C://Users//ti01045//Desktop//Care_AppTest_New.xlsx");
		FileInputStream fs = new FileInputStream(srcFile);
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sh = wb.getSheet("CareApp");
		System.out.println(sh.getRow(1).getCell(2).getStringCellValue());
		
		sh.getRow(12).createCell(5).setCellValue("kushwaha");
		FileOutputStream fos = new FileOutputStream(srcFile);
		wb.write(fos);
		fos.close();
		System.out.println("Done");
		
		
		
		
	}

}
