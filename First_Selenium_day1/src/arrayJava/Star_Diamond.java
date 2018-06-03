package arrayJava;

public class Star_Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Star_Diamond.diamond();
		Star_Diamond.diamondreverse();
	}
	public static void diamond(){
    for (int i = 1; i <= 15; i++)
    {
          for (int j = 0; j < (15 - i); j++)
                System.out.print(" ");
          for (int j = 1; j <= i; j++)
                System.out.print("*");
          for (int k = 1; k < i; k++)
                System.out.print("*");
          System.out.println();
    }
}
	public static void diamondreverse(){
	    for (int i = 15; i >= 1; i--){
	    for(int j= 1; j<=i;j++){
	    	System.out.print("*");
	    }
	    System.out.println();
	    }
	    }
}
