package arrayJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelXLSX {

	public static void main(String[] args) throws IOException {
		File src= new File("C:\\Users\\ti01045\\Desktop\\data_28_Dec_15_Selenium.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(1);
		
		int rownum = sheet.getLastRowNum()+1;
		int columnNum = sheet.getRow(0).getLastCellNum();
		
		String[][] data = new String[rownum][columnNum];
		for(int i=0;i<rownum;i++){
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<columnNum;j++){
				XSSFCell cell = row.getCell(j);
				String value = cellToString(cell);
				data[i][j] = value;
				System.out.println(value);
	    	}
		}
		wb.close();
	}
	
	private static String cellToString(XSSFCell cell) {
		int type;
		Object result;
		type= cell.getCellType();
		switch(type){
		
		case 0: //Numeric value in Excel
			result = cell.getNumericCellValue();
			break;
		case 1: // String value
			result = cell.getStringCellValue();
			break;
		   default:
			   throw new RuntimeException("this are mmmmmm-----");
		}
		return result.toString();
	}
}
