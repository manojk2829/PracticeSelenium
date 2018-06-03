package arrayJava;

public class StarReverse {

	public static void main(String[] args) {
		for(int a=1;a<10;a++){
			for(int b=10;b>a;b--){
				System.out.print("*");
			}
			System.out.println(" ");
		}
		int r,s;
		for(r=2;r<=10;r++){
			for(s=1;s<=r;s++){
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println("---------------------------------");
		
		for(int i = 10;i>=1;i--){
			for(int j=10;j>=i;j--){
				System.out.print(" ");
			}
			for(int p=1;p<=i;p++){
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println("-----------------------------------------");
			int d,e,f;
		for(d=9;d>=1;d--){
			for(e=10;e>d;e--){
				System.out.print(" ");
			}
			for(f=1;f<(d*2);f++){
				System.out.print("*");
			}
			System.out.println(" ");
		}	
		int x,y,z;
		for(x=2;x<=10;x++){
			for(y=x;y<10;y++)
			{
				System.out.print(" ");
			}
			for(z=1;z<(x*2);z++){
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}