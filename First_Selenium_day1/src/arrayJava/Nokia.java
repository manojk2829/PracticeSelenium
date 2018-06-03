package arrayJava;

public class Nokia implements Phone{

	@Override
	public void call() {
		System.out.println("Nokia Phone is calling....");
		
	}

	@Override
	public void switchOn() {
		System.out.println("Nokia Phone is Switch on....");
		
	}

	@Override
	public void switchOff() {
		System.out.println("Nokia Phone is getting Switched off....");
		
	}
	

}
