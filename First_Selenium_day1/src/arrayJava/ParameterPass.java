package arrayJava;

public class ParameterPass {

	public static void main(String[] args) {
		ParameterPass obj = new ParameterPass();
		obj.sum(2,4);
		obj.mul(25,4);
		obj.Printmethod();
		CallingParameter.sum(2, 30, 5);  // Static method calling.
		int x = CallingParameter.Mul(2,4,5);
		System.out.println(CallingParameter.Mul(20,4,5));
		System.out.println(x);
	}
	
	public void Printmethod()
	{
		System.out.println("PrintMethod");
	}
	public void sum(int a, int b)
	{
		int sum = a+b; 
		System.out.println("Sum --- " + sum);
	}
	public void mul(int a, int b)
	{
		int mul = a*b; 
		System.out.println("Sum --- " + mul);
	}
	

}
