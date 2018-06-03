package arrayJava;

public class PolyExample {

	public  void main(String[] args) {
	
		 add(2, 3);
	     add(2,4,6);
	     add(2.45,6,6);
	     add(45,6.7,6);
		
}	
	public int add(int a,int b){
	int c = a+b;
	System.out.println(c);
	return c;
}
	public static int add(int a,int b, int d){
	int c = a+b+d;
	System.out.println(c);
	return c;
}
	public void add(double a,int b, int d){
	double x = a+b+d;
	System.out.println(x);
	}
	public void add(int a,double b, int d){
		double x = a+b+d;
		System.out.println(x);
  }
}