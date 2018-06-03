package arrayJava;

import java.io.File;

import jxl.Workbook;

public class ExcelRead {

	public static void main(String[] args) throws Exception {
	 
		File src = new File("C:/Users/ti01045/Desktop/Read_data_by_selenium.xls");
		System.out.println("My Excel file found");
		Workbook wb = Workbook.getWorkbook(src);
		System.out.println("File uploaded successfully.");
		String Data00 = wb.getSheet(0).getCell(0,0).getContents();
		System.out.println("File Data ----" + Data00);
		String Data01 = wb.getSheet(0).getCell(0,1).getContents();
		System.out.println("File Data ----" + Data01);
		String Data02 = wb.getSheet(0).getCell(0,2).getContents();
		System.out.println("File Data ----" + Data02);
		String Data03 = wb.getSheet(0).getCell(0,3).getContents();
		System.out.println("File Data ----" + Data03);
		
		String Data10 = wb.getSheet(0).getCell(1,0).getContents();
		System.out.println("File Data ----" + Data10);
		String Data11 = wb.getSheet(0).getCell(1,1).getContents();
		System.out.println("File Data ----" + Data11);
		String Data12 = wb.getSheet(0).getCell(1,2).getContents();
		System.out.println("File Data ----" + Data12);
		String Data13 = wb.getSheet(0).getCell(1,3).getContents();
		System.out.println("File Data ----" + Data13);
		
		String Data20 = wb.getSheet(0).getCell(2,0).getContents();
		System.out.println("File Data ----" + Data20);
		String Data21 = wb.getSheet(0).getCell(2,1).getContents();
		System.out.println("File Data ----" + Data21);
		String Data22 = wb.getSheet(0).getCell(2,2).getContents();
		System.out.println("File Data ----" + Data22);
		String Data23 = wb.getSheet(0).getCell(2,3).getContents();
		System.out.println("File Data ----" + Data23);
	}

}
