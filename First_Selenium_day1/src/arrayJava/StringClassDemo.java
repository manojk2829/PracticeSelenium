package arrayJava;

public class StringClassDemo {

	public static void main(String[] args) {
	  String First = "I am manoj kushwha";
	  String Last = "I am using Selenium";
	  
	  boolean check = First.startsWith("am");
	  System.out.println("Status is check...." + check);
	  
	  boolean lastcheck = Last.endsWith("Selenium");
	  System.out.println("Status is check...." + lastcheck);
	  
	  String actual = "My name is Kushwaha";
	  String Expected = "My name is Kushwaha";
	  
	  boolean value = actual.equals(Expected);
	  System.out.println(value);
	  boolean value1 = actual.equalsIgnoreCase(Expected);
	  System.out.println(value1); 
 
	  System.out.println("--------------------------------------");
	  
	   boolean value2 = actual.contains("Kushwaha");
	   System.out.println(value2);
	 
	   boolean value3 = actual.contains(Expected);
	   System.out.println(value3);
	 
	   String Trim = "   Manoj Kushwaha   -  ";
	   System.out.println(Trim.trim());
	   System.out.println(Trim.trim().charAt(8));
	 
	}
}
