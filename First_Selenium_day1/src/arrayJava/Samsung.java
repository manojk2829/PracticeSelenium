package arrayJava;

public class Samsung implements Phone{

	@Override
	public void call() {
		System.out.println("Samsung Calling..");	
	}

	@Override
	public void switchOn() {
		System.out.println("Samsung On..");
		
	}

	@Override
	public void switchOff() {
		System.out.println("Samsung Off..");			
	}
	
	public void records(){
		System.out.println("Samsung store the records....");
	}

}
