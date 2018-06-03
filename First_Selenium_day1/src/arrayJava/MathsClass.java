package arrayJava;

public class MathsClass {

	public static void main(String[] args) {
		System.out.println("I am manoj -- Start maths program");
		MathsClass.sumNumber(20, 40);
		MathsClass.SubstractNumber(40, 30);
		MathsClass.MulNumber(5, 10);
		MathsClass.DivNumber(2, 8);
	}
public static void sumNumber(int a, int b){
	float c=a+b;
	System.out.println("Print value for variable --- " + c);
}
public static void SubstractNumber(int a, int b){
	int c=a-b;
	System.out.println("Print value for variable --- " + c);
}	
public static void MulNumber(int a, int b){
	int c=a*b;
	System.out.println("Print value for variable --- " + c);
}
public static void DivNumber(float a, float b){
	float c=a/b;
	System.out.println("Print value for variable --- " + c);
}
}
