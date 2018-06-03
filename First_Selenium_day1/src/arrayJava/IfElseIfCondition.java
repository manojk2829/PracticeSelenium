package arrayJava;

public class IfElseIfCondition {

	public static void main(String[] args) {
		String browser = "ie";
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.out.println("Open Browser name -- Chrome");
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			System.out.println("Open Browser name -- Firefox");
		}
		else if(browser.equalsIgnoreCase("IE"))
		{
			System.out.println("Open Browser name -- IE");
		}
		else 
		{
			System.out.println("Provide right browser Name");
		}
	}

}
