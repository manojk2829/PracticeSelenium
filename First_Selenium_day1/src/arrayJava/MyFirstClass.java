package arrayJava;

public class MyFirstClass {
	public static void main(String[] args)
	{
	MyFirstClass.myMethod1();
	MyFirstClass.myMethod2();
	MyFirstClass.myMethod3(200,500);
	MyFirstClass.myMethod4(600,500);
	MyFirstClass.myMethod5(60,5);
	MyFirstClass.myMethod6(60,5);
	MyFirstClass.fabonaciseries();
	}
	public static void myMethod1(){
		System.out.println("My first Method call");
	}
	public static void myMethod2(){
		System.out.println("My Second Method for adding two integer hard coded values.");
		int x; // Declaration
		int y; // Declaration
		x=4226; y=200;
		int z=x+y;
		System.out.println(z);
	}
	public static void myMethod3(int p, int q){
		System.out.println("My third Method for adding two integer values.");
			int add=p+q;
		System.out.println(add);
}
	public static void myMethod4(int p, int q){
		System.out.println("My fourth Method for Sub two integer values.");
			int Sub=p-q;
		System.out.println(Sub);
}
	public static void myMethod5(int p, int q){
		System.out.println("My five Method for multiplie two integer values.");
			int Multiple=p*q;
		System.out.println(Multiple);
}
	public static void myMethod6(int p, int q){
		System.out.println("My Six Method for Devided by two integer values.");
			int Devide=p/q;
		System.out.println(Devide);
}
			public static void fabonaciseries()
			{
				int n1=0;
				int n2=1; int n3; 
				int count=20;
				int i;
				System.out.print(n1 +" " + n2);
				for (i=2; i<count;i++)
				{				
				n3=n1+n2;
				System.out.print("  " + +n3);
				n1=n2;
				n2=n3;
			 }
}
}	
 