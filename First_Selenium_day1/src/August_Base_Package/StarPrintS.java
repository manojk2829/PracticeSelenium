package August_Base_Package;

public class StarPrintS {

	public static void main(String[] args) {
		//http://www.includehelp.com/java-programs/print-pattern-of-stars.aspx
		for(int i=6;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}System.out.println();
		}
		for(int i=1;i<=6;i++){
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}System.out.println();
		}
        System.out.println("----------------");
        int a=6,b=2*a-2;
	    for(int x=1;x<=a;x++){
	    	for(int y=1;y<=b;y++){
	    		System.out.print(" ");
	    	}b=b-2;
	    	for(int z=1;z<=x;z++){
	    		System.out.print("* ");
	    	}System.out.println();
	    }
	    
		System.out.println("------------------");
		int n=6;int k=2*n-2;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=k;j++){
				System.out.print(" ");
			}k=k-1;
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}System.out.println();
		}

		int p=6;int q=2*n-2;
		for(int i=p;i>=1;i--){
			for(int j=1;j<=p;j++){
				System.out.print(" ");
			}q=p-1;
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}System.out.println();
		}
	}
}
