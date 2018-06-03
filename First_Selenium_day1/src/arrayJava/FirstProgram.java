package arrayJava;

public class FirstProgram {
      public static void main(String arg[]){
    	  System.out.println("First Hello World");
    	  
    	 int a = 50;
    	 int b = 100;
    	 if(a>50){
    		 System.out.println("A is not equal to 50");
    	 }
    	 else{
    		 System.out.println("A is equal to 50");
    	 }
    	 if (b < 100 && b == 100){
    		 System.out.println("b is not match both statment");
    	 }
    	 else{
    		 System.out.println("b is equal to 100");
    	 }
    	 if(a == 50 && b < 100){
    		 System.out.println("A and B not follow both statment");
    	 }
    	 else if(a == 50 || b < 100){
    		 System.out.println("A statment is right but b is not");
    	 }
    	 {
    		 System.out.println("B is 100");
    	 }
    	 int c = 200;
    	 if(a == 50 || b < 100 || c > 100){
    		 System.out.println("A and C statment are right but b is not -- ");
    	 }
    	 else{
    		 System.out.println("By using &&, your both statment should true.");
    	 }
    	 {
    		 System.out.println("By using && sign, your both statment should true. and if you use || sign any one statent should true.");
    	 }
    	 
    	 if (a > b){
    		 System.out.println("a is gereater than b --- " + a);
    		     	 }
    	 else System.out.println("b is greater than a -- " + b);
    	 
    	 if (a > b && b > a)
    	 {
    		System.out.println("Both or not match");
    	 }
         if ( a > b || b > a)
    		{
    			System.out.println("b is realy greater than a" + b);
    		}
    	 }
      }
