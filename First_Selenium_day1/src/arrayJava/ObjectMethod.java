package arrayJava;

public class ObjectMethod {
	static int a = 10;
	static int b = 20;
	public static void main(String[] args) {
    	a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("a = " + a + "   " + "b = " + b);
		ObjectMethod objSum = new ObjectMethod();
		objSum.sum();
		System.out.println("Enf the Process.");
		CallingClass.sub();
		CallingClass.sum();
		CallingClass Operation = new CallingClass();
		{
			Operation.div();
			Operation.mul();
			System.out.println("Application -- " + Operation.name);
			System.out.println("Application -- " + Operation.last);
		}
	}

	 public void sum(){
		 int a = 200;
		 int b = 100;
		 int c = a+b;
		 System.out.println(c);	 
		 	 
	 }
	 
}
