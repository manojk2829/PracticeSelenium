package arrayJava;

public class StarPractis {

	public static void main(String[] args) {
   for(int r=1;r<=8;r++){
	   for(int s=r;s<8;s++){
		   System.out.print(" ");
	   }
	   for(int t=1;t<(r*2);t++){
		   System.out.print("*");
	   }
   System.out.println(" ");
   }
   for(int x=8;x>=1;x--){
	   for(int y=8;y>x;y--){
		   System.out.print(" ");
	   }
	   for(int z=1;z<(x*2);z++){
		   System.out.print("*");
	   }
	   System.out.println(" ");
   }
   for(int a=1;a<=8;a++){
	   for(int b=a;b<8;b++){
		   System.out.print(" ");
	   }
	   for(int c=1;c<(a*2);c++){
		   System.out.print("*");
	   }
	   System.out.println(" ");
   }
   for(int i=1;i<=10;i++){
	   for(int j=1;j<=i;j++){
		   System.out.print("*");
	   }
	   System.out.println(" ");
   }
   for(int u=10;u>1;u--){
	   for(int v=u;v>1;v--){
		   System.out.print("*");
	   }
	   System.out.println(" ");
   }
   for(int u=10;u>1;u--){
	   for(int v=10;v>u;v--){
		   System.out.print(" ");
	   }
	   for(int i=1;i<=10;i++){
	   System.out.print("*");
   }
	   System.out.println(" ");
	   }
   for(int u=10;u>1;u--){
	   for(int v=10;v>u;v--){
		   System.out.print(" ");
	   }
	   for(int i=1;i<u;i++){
	   System.out.print("*");
   }
	   System.out.println(" ");
    }
   int q = 3;
   switch (q){
   case 1:
	   System.out.println("----1");
	   break; 
   case 2:
	   System.out.println("----2");
	   break; 
   case 3:
	   System.out.println("---- 3");
	   break; 
   case 4:
	   System.out.println("----4");
	   break;
   }
  }
}
