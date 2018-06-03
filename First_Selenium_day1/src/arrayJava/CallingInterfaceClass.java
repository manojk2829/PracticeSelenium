package arrayJava;

public class CallingInterfaceClass {

	public static void main(String[] args) {
		Nokia n = new Nokia();
		Samsung s = new Samsung();
		n.call();
		n.switchOn();
		n.switchOff();
		
		s.call();
		s.records();
	
	}

}
