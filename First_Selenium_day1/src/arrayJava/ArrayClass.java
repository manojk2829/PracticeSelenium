package arrayJava;

public class ArrayClass {

	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		System.out.println(a[3]+ "   " + a[1]);
		// Enhanced for loop
		for(int temp : a){
			System.out.println(temp);
		}
		System.out.println("************");
		int[] x = new int[5];
		x[2] = 30;
		x[4] = 50;

		for(int temp : x){
			System.out.println(temp);
		} 
		System.out.println("************");
		String[] str = new String[7];
		str[1] = "raj";
		str[5] = "kumar";
		String[] str1 = {"Raju","manoj","alok","Sumit"};
	    System.out.println(str[1] + "----" + str[5]);
	    System.out.println("************");
		for(String temp3 : str ){
			System.out.println(temp3);}
		 System.out.println("************");
			for(String temp4 : str1 ){
				System.out.println(temp4);
    	}
}
}
