package arrayJava;

import java.util.Hashtable;

import JulyUTIL.Xls_Reader;

public class ExcelUtilData {
	public static Object[][] getExcelData(Xls_Reader xls,String testName){
		String sheetName = "CareApp";
		int TestrowNumber = 1;
		while(!xls.getCellData(sheetName, 0, TestrowNumber).equals(testName)){
			TestrowNumber++;
		}System.out.println(TestrowNumber);
		
		int rowStart = TestrowNumber+2;
		int colStart=  TestrowNumber+1;
		int row =0;
		while(!xls.getCellData(sheetName, 0, rowStart+row).equals("")){
			row++;
		}System.out.println(row);
		
		int col =0;
		while(!xls.getCellData(sheetName, col, colStart).equals("")){
			col++;
		}System.out.println(col);
		
		Object[][] data = new Object[row][1];
		Hashtable<String,String> table = null;
		int rowData=0;
		for(int r=rowStart;r<rowStart+row;r++){
			table = new Hashtable<String,String>();
			for(int c=0;c<col;c++){
				String key = xls.getCellData(sheetName, c, colStart);
				String value  = xls.getCellData(sheetName, c, r);
				table.put(key, value);
			}
			data[rowData][0]= table;
			rowData++;
		}
		return data;
	}	
}
