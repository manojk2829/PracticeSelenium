package arrayJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelXLSX {

	public static void main(String[] args) throws Exception{
	 File excel = new File("C:\\Users\\ti01045\\Desktop\\data_28_Dec_15_Selenium.xlsx");
	 FileInputStream fis = new FileInputStream(excel);
	 XSSFWorkbook wb = new XSSFWorkbook(fis);
	 XSSFSheet sheet = wb.getSheetAt(1);
	 //Read Excel ---- 
	 String data00 = sheet.getRow(0).getCell(0).getStringCellValue();
	 System.out.println(data00);
	 String data01 = sheet.getRow(0).getCell(1).getStringCellValue();
	 System.out.println(data01);
	 String data02 = sheet.getRow(0).getCell(2).getStringCellValue();
	 System.out.println(data02);
	 String data10 = sheet.getRow(1).getCell(0).getStringCellValue();
	 System.out.println(data10);
	 String data11 = sheet.getRow(1).getCell(1).getStringCellValue();
	 System.out.println(data11);
	 String data12 = sheet.getRow(1).getCell(2).getStringCellValue();
	 System.out.println(data12);
	 String data20 = sheet.getRow(2).getCell(0).getStringCellValue();
	 System.out.println(data20);
	 String data21 = sheet.getRow(2).getCell(1).getStringCellValue();
	 System.out.println(data21);
	 String data22 = sheet.getRow(2).getCell(2).getStringCellValue();
	 System.out.println(data22);
	 
	 sheet.getRow(0).createCell(6).setCellValue(5345345);
	 sheet.getRow(1).createCell(6).setCellValue("Manoj Kushwaha");
	 sheet.getRow(2).createCell(6).setCellValue("Manoj Kushwaha");
	 FileOutputStream fos = new FileOutputStream(excel);
	 wb.write(fos);
	 wb.close();
	 
	}

}
