package arrayJava;

public class TwoDArray {

	public static void main(String[] args) {
	   int[][] TD = new int[4][3];
	   TD[0][0] = 5;
	   TD[0][1] = 10;
	   TD[0][2] = 15;
	   TD[0][3] = 5;
	  
	   TD[1][0] = 20;
	   TD[1][1] = 25;
	   TD[1][2] = 21;
	   TD[1][3] = 22;
	 
	   for(int i=0;i<2;i++){
		   for(int j=0;j<4;j++){
			  System.out.println(TD[i][j] + " "); 
		   }
	   }
	   int temp =10;
	   for(int i=0;i<4;i++){
		   for(int j=0;j<3;j++){
			  System.out.print(TD[i][j] + "  ");
			  TD[i][j] = temp;
			  temp =+10;
		   }
}
}}