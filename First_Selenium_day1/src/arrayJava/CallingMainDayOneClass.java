package arrayJava;

public class CallingMainDayOneClass {

	public static void main(String[] args) {
		
		DayOneClass day1 = new DayOneClass();
		DayOneClass day2 = new DayOneClass();
		DayOneClass day3 = new DayOneClass();

		day1.name = "a";
		day2.name = "b";
		day3.name = "c";
	
		System.out.println(day1.name);
		System.out.println(day2.name);
		System.out.println(day3.name);
		
		day1 = day3;
		
		System.out.println(day1.name);
		System.out.println(day2.name);
		System.out.println(day3.name);
		
		
	}

}
