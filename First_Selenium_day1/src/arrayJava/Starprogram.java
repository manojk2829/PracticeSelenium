package arrayJava;

public class Starprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Star Program");
Starprogram.loopStardecreses();
Starprogram.loopincress();

	}
public static void loopStardecreses()
{    for(int i=1;i<=6;i++)
    {
    for(int j=6;j>=i;j--)
    {
        System.out.print("*");
    }
    System.out.println();
}
}
public static void loopincress(){
	for(int p=2;p<=6;p++){
		for(int q=1;q<=p;q++){
			System.out.print("*");
		}
		System.out.println("");
	}
}
}


