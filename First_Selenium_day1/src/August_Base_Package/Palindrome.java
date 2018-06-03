package August_Base_Package;

public class Palindrome {

	public static void main(String[] args) {
		int n=5451;
		int temp;
		int sum=0;
        temp=n;
		while(n>0){
			int r = n%10;
			sum = (sum*10)+r;
			n=n/10;
		}if(temp==sum){
			System.out.println("palindrome");
		}else{
			System.out.println("not palindrome");
		}
		

	}
}
