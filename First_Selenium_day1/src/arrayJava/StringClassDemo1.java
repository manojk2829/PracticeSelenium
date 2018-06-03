package arrayJava;

public class StringClassDemo1 {

	public static void main(String[] args) {
		String value = "Manoj Kushwaha working in BBCL";
		String value1= "Kushwaha also working with BBCL";
		boolean Start = value.startsWith("manoj");
		boolean Last = value1.endsWith("with");
		System.out.println(Start);
		System.out.println(Last);
        
		String actual = "122$";
		String Expected= "manoj Kushwaha working with BBCL";
		boolean Status = actual.equals(Expected);
		System.out.println(Status);
		
		boolean newstatus = actual.equalsIgnoreCase(Expected);
		System.out.println(newstatus);
		System.out.println("-------------");
		System.out.println(actual.contains("122"));
		System.out.println(Expected.trim().charAt(10));
	}

}
