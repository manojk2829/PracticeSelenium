package August_Base_Package;

public class StartPattern1 {

	public static void main(String[] args) {
		/*for(int i=1;i<=6;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println("-----------");
		
		for(int i=6;i>=1;i--){
			for(int j=i;j>=1;j--){
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		
		System.out.println("0-----------------------------0");
		/*int k=2*6-2;
		for(int i=1;i<=6;i++){
			for(int j=1;j<=k;j++){
				System.out.print("  ");
			}
			k=k-2;
			for(int j=0;j<=i;j++){
				System.out.print(" * ");
			}System.out.println("  ");
		}*/
		int n=6;
		int i, j, k=2*n-2;
		 
        // outer loop to handle number of rows
        //  n in this case
        for(i=0; i<n; i++){
 
            // inner loop to handle number spaces
            // values changing acc. to requirement
            for(j=0; j<=k; j++)
            {
                // printing spaces
                System.out.print(" ");
            }
             
            // decrementing k after each loop
            k = k - 2;
             
            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for(j=0; j<=i; j++)
            {
                // printing stars
                System.out.print("* ");
            }
             
            // ending line after each row
            System.out.println();
        }

	}

}
