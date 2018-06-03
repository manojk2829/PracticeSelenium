package arrayJava;

public class TwoDimArrays {

	public static void main(String[] args) {
	    String[][] str = new String[3][4];
	    str[0][0] = "A00";
	    str[0][1] = "A01";
	    str[0][2] = "A02";
	    str[0][3] = "A03";
	    
	    str[1][0] = "B00";
	    str[1][1] = "B01";
	    str[1][2] = "B02";
	    str[1][3] = "B03";
	    
	    str[2][0] = "C00";
	    str[2][1] = "C01";
	    str[2][2] = "C02";
	    str[2][3] = "C03";
	   
	    System.out.println("Row number-- " + str.length);
	    System.out.println("Column number-- " + str[0].length);
	    
	    int rownum = str.length;
	    int columnnum = str[0].length;
	    		
	    for(int i=0;i<rownum;i++){
	    	for(int j=0;j<columnnum;j++)
	    	{
	    		System.out.print(str[i][j] + "  ");
	    	}
	    	System.out.println("   ");
	}
  }
}
