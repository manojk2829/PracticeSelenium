package arrayJava;

public class EvenOddnumber {

	public static void main(String[] args) {
		//EvenOddnumber.evenNumber();
		//EvenOddnumber.onlyEvenNumber();
		//System.out.println("Now print one two prizam.....");
		EvenOddnumber.printprizm();
		EvenOddnumber.revercstar();
		EvenOddnumber.numbertable(2);
		EvenOddnumber.loopStardecreses();
		EvenOddnumber.loopincress();
	}
	public static void evenNumber(){
		for(int i=1;i<=10;i++){
			System.out.println("Serial number" + "  " + i);
			if (i%2==0)
			{
				System.out.println("Number is even");
			}
			else{
				System.out.println("Numbber is odd");
			}			
		}
		}
	public static void onlyEvenNumber(){
		for(int i=1;i<=12;i++){
			if(i%2==0)
			{
				System.out.println("Number is Even --" + " " + i);
			}
			else
			{
				System.out.println("Number is Odd --" + " " + i);
			}
		}
	}
	
	public static void printprizm(){
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++){
				System.out.print(i);
				}
			System.out.println( " " );
		}
		
	}
	public static void revercstar()
	{

	for(int i=1;i<=6;i++){
		for(int j=6;j>=i;j--){
			System.out.print(i);
		}
		System.out.println( " " );
	}	
	}
	public static void numbertable(int a){
		for(int i=1;i<=10;i++){
		int	table=a*i;
		System.out.println("table according to number ---" + table);
		}
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

