package arrayJava;
public class Ifelse {
	int a= 20;
	int b= 30;
	int c;
	String pName="Raju";
	
	public int add_num()
{
	System.out.println("Please add 2 char--- a and b");
	int c = a+b;
if (c < 45)
{
System.out.println("I am Right ");	
}
else
{
System.out.println("I am Wrong");
}
return c;
}
public String display()
{
if (pName == "Raju")
{
	System.out.println("I am Raju");
}
else
{
	System.out.println("NOt Raju");
}
return "p";
}

public int result(){
	    int testscore = 76;
        char grade;
        {
        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else { grade = 'F'; }
        System.out.println("Grade = " + grade);
    }
        return 0;
}}
