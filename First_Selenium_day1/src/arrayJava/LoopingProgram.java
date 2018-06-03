package arrayJava;
public class LoopingProgram {
	public static void main(String[] args) {
		LoopingProgram.loopProgramTable(4);
	}
public static void loopProgramTable(int c)
{

for(int i=1;i <=12;i++)

	if (i<= 11)

{
int T=c*i;
System.out.println(T);
}
	else
	{
		System.out.println("value is over ---");	
	}
}
}
