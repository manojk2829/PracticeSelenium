package arrayJava;

public class ObjectAndRefrance {
       int wheels = 4;
       int age = 25;
       static String carName = "marc";
       static String EndStart = "Powser";
	public static void main(String[] args) {
		start();
		carName="MarutiNew";
		System.out.println(carName);
		ObjectAndRefrance c1 = new ObjectAndRefrance();
		System.out.println(c1.age);
		System.out.println(c1.wheels);
		
		ObjectAndRefrance c2 = new ObjectAndRefrance();
		System.out.println(c2.age);
		System.out.println(c2.wheels);
		System.out.println(carName);
		c2.color();
		c1.end();
		System.out.println(EndStart);
		
		
		
			
	}
	
	public static void start(){
		System.out.println("Start successfull....");
	}
	public void end(){
		System.out.println("End user.....");
	}
	
	public void color(){
		String colour = "Red";
		String Name = "Maruti@@@";
		System.out.println("Byke colour is -- " + colour);
		System.out.println(Name);
	}
}

