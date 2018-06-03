package arrayJava;

public class Classandmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("NOW method calling programm--");
Classandmethod.swapProgramm();
System.out.println("NOW method calling programm-- Without using third variable");
Classandmethod.swapProgrammwithoutthirdvariable();
}
	public static void swapProgramm(){
		int x=10;int y=20;
		int c;
        c=x+y;
        y=c-y;
        x=c-x;
System.out.println("Now i found x's values" + " " + c);
System.out.println("Now i found x's values" + " " + x);
System.out.println("Now i found y's values" + " " + y);

	}
	public static void swapProgrammwithoutthirdvariable(){
		int x=10;int y=20;
		
        x=x+y;
        y=x-y;
        x=x-y;
System.out.println("  ");
System.out.println("Now i found x's values" + " " + x);
System.out.println("Now i found y's values" + " " + y);
}
}

