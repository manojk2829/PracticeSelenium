package August_Base_Package;

import java.util.Hashtable;

import Delete_BaseClass.Xls_Reader;

public class readUtil_Excel_August {
	 public static Object[][] getReadExcel(Xls_Reader xls,String testCaseName){
		 String sheetName = "CareApp";
		 int StartTest = 1;
		 while(!xls.getCellData(sheetName, 0, StartTest).equals(testCaseName)){
			 StartTest++;
		 }System.out.println(StartTest);
		 int rowStart = StartTest+2;
		 int colStart = StartTest+1;
		 int row=0;
		 while(!xls.getCellData(sheetName, 0, rowStart+row).equals("")){
			 row++;
		 }System.out.println(row);
		 
		 int col=0;
		 while(!xls.getCellData(sheetName, col, colStart).equals("")){
			 col++;
		 }System.out.println(col);
		 
		 Hashtable<String,String> table  = null;
		 Object[][] data = new Object[row][1];
		 int DataRow=0;
		 for(int r=rowStart;r<rowStart+row;r++){
			 table  = new Hashtable<String,String>();
			 for(int c=0;c<col;c++){				 
				 String key = xls.getCellData(sheetName, c, colStart);
				 String value = xls.getCellData(sheetName, c, r);
				 table.put(key, value);
			 }
			 data[DataRow][0] = table;
			 DataRow++;			
		 }
		 return data;
 }
}
