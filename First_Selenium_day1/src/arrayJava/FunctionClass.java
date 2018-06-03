package arrayJava;

public class FunctionClass {

	public static void main(String[] args) {
	    printname();
		printname("A", "B");
		sumVoid();

 System.out.println(forloop(200));
 System.out.println(forloop(200));
 }
	public static void printname(){
		System.out.println("Manoj Kushwaha");
	}
	public static void printname(String FirstName, String LastName){
		System.out.println("Sumit Bhasin");
	}
	public static void sumVoid(){
		int a = 10;
		int sum1 = a+100;
		System.out.println(sum1);
	}
	
	public static int sumAdd(int a,int b){
		int sum2 = a+b;
		System.out.println(sum2);
		return sum2;
	}
	public static int forloop(double n){
		int sumA =0;
		for(int i=0;i<=n;i++){
			sumA = i+sumA;
	 }
		return sumA;
   }
}
