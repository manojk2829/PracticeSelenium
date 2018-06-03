package arrayJava;

public class CallingClass {
	  String name = "Manoj";
	  String last = "Kushwaha";
      public static void sum(){
    	  int a =2; int b = 5;
    	  int sum = a+b;
    	  System.out.println(sum  + " Sum operation." );
      }
      public static void sub(){
    	  int b = 3; int a = 1;
    	  int sub = b-a;
    	  System.out.println(sub + " Sub operation.");
     }
      public void mul(){
    	  int a =2; int b = 5;
    	  int mul = a*b;
    	  System.out.println(mul  + " mul operation." );
      }
      public void div(){
    	  int b = 30; int a = 10;
    	  int div = b/a;
    	  System.out.println(div + " div operation.");
     }
}
