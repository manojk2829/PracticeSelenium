package August_Base_Package;

public class WithoutLoop1To10 {

	public static void main(String[] args) {
		recursive(1);

	}
	public static void recursive(int i){
		if(i<=10){
			System.out.println(i);
			recursive(i+1);
		}
	}

}
