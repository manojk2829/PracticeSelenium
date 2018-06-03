package August_Base_Package;

public class NumberPrime {

	public static void main(String[] args) {
		boolean isPrime = true;
		int n=23;
		for(int i=2;i<=n/2;i++){
			if(n%i==0){
				isPrime = false;
				break;
			}
		}
		if(isPrime){
			System.out.println("Prime");
		}else{
			System.out.println("Not Prime");
		}
		
		for(int p=2;p<=n;p++){
			boolean isPri = true;
			for(int j=2;j<p;j++){
				if(p%j==0){
					isPri = false;
					break;
				}
			}if(isPri){
				System.out.println(p);
			}
		}
		System.out.println("-------------Factorial Number----------------");
		
		int fact=1;
		for(int i=1;i<=6;i++){
			fact = fact*i;
		}System.out.println(fact);
		
		System.out.println("-------------Fabonaci Serice Number----------------");
		int n1=0, n2=1,n3;
		System.out.print(n1 + " " + n2);
		
		for(int i=2;i<=10;i++){
			n3=n1+n2;
			System.out.print(" " + n3);
			n1=n2;
			n2=n3;
			
		}
		System.out.println(" ");
		recursive(1);
		
		System.out.println("---------------- Palindrome  ----------------");
		
		int r,sum=0,temp;
		int num= 212;
		temp=num;
		while(num>0){
			r=num%10;
			sum=(sum*10)+r;
            num=num/10;			
		}if(temp==sum)
			System.out.println("Number is Pallandrom...");
		else
			System.out.println("Not Pallandrom...");
	}
	
	public static void recursive(int i){
		if(i<=10){
			System.out.println(i);
			recursive(i+1);
		}
	}
}
