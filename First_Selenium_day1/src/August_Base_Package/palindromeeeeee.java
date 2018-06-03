package August_Base_Package;

public class palindromeeeeee {

	public static void main(String[] args) {
		int n=12321;
		int temp;
		int sum=0;
		temp=n;
		while(n>0){
			int r = n%10;
			sum=(sum*10)+r;
			n=n/10;
		}if(temp==sum){
			System.out.println(sum + " Number is palindrome....");
		}else{
			System.out.println(sum + " Number is not palindrome....");
		}
/*		   System.out.println("----------------------");
		int fact=1;
		for(int i=1;i<=6;i++){
			fact = fact*i;
		}System.out.println(fact);
		   System.out.println("----------------------");
		int m=23;
	   for(int i=2; i<=m;i++){
		   boolean is=true;
		   for(int j=2;j<i;j++){
			   if(i%j==0){
				   is=false;
				   break;
			   }
		   }if(is){
			   System.out.println(i);
	         }
	   }
	   System.out.println("----------------------");
	   int p=23;
	   boolean isP=true;
	   for(int i=2;i<=p/2;i++){
		   if(p%i==0){
			  isP=false;
			  break;
		   }
	   }
	   if(isP){
		   System.out.println("Prime");
	   }else{
		   System.out.println("Not..");
	   }
	   System.out.println("----------------------");   */
		
		
		int m1=0,m2=1,m3;
				System.out.print(m1 + "   "+ m2);
				for(int i=2;i<=10;i++){
					m3=m1+m2;
					System.out.print("  " + m3);
					m1=m2;
					m2=m3;
				}
		
		
		
	}
}
