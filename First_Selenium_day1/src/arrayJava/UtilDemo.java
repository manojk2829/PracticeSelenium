package arrayJava;

import java.util.Hashtable;

import org.apache.poi.ss.usermodel.Row;

import JulyUTIL.Xls_Reader;

public class UtilDemo {
	public static Object[][] getData(Xls_Reader xls,String testName){
		String sheetName = "Demo";
		int testStart = 1;
		while(!xls.getCellData(sheetName, 0, testStart).equals(testName)){
			testStart++;
		}System.out.println(testStart);
		
		int rowStart= testStart+2;
		int colStart= testStart+1;
		int row = 0;
		while(!xls.getCellData(sheetName, 0, rowStart+row).equals("")){
			row++;
		}System.out.println(row);

		
		int col = 0;
		while(!xls.getCellData(sheetName, col, colStart).equals("")){
			col++;
		}System.out.println(col);
		
		
		Object[][] data = new Object[row][1];
		int RowData=0;
		Hashtable<String, String> table = null;
		for(int r=rowStart;r<rowStart+row;r++){
			table = new Hashtable<String, String>();
		for(int c=0;c<col;c++){
			String key = xls.getCellData(sheetName, c, colStart);
			String value = xls.getCellData(sheetName, c, r);
			table.put(key, value);
		}
		data[RowData][0]=table;
		RowData++;
	 }
	return data;
		
	}
	
	public static boolean isRunable(String testName,Xls_Reader xls){
		String sheetName = "case";
		int rowCount = xls.getRowCount(sheetName);
		for(int r=2;r<rowCount;r++){
			String TCID = xls.getCellData(sheetName, "TCID", r);
			if(TCID.equals(testName)){
				String runmode = xls.getCellData(sheetName, "Runmmode", r);
				if(runmode.equals("Y")){
					return true;
				}else return false;
			}
		}
		return true;
	}

}
