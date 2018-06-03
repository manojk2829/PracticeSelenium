package arrayJava;

import inActiveLink.BrokenLink;

public class ConditionalIfElse extends BrokenLink {

	public static void main(String[] args) {
		
		System.out.println("Start Test Case Execution");
		
		String browser = "chrome";
				if(browser.equalsIgnoreCase("Chrome"))
				{
					System.out.println("Application open in Chrome Browser");
				}
				else
				{
					System.out.println("Application open in Firefox Browser");
				}
	}
}
