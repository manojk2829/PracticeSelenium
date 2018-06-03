package August_Base_Package;

public class StarPrizme {

	public static void main(String[] args) {
		int i,j,n=6,k=2*n-2;
		for(i=1;i<=n;i++){
			for(j=1;j<=k;j++){
				System.out.print(" ");
			}k=k-1;
			for(j=1;j<=i;j++){
				System.out.print("* ");
			}System.out.println();
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		int nn=6;
		int ii,jj,kk=2*nn-2;
		for(ii=1;ii<=n;ii++){
			for(jj=1;jj<=kk;jj++){
				System.out.print(" ");
			}kk=kk-2;
			for(jj=1;jj<=ii;jj++){
				System.out.print("* ");
			}System.out.println();
		}
		System.out.println("------------------------------");
		
		for(i=1;i<=10;i++){
			for(j=1;j<=i;j++){
				System.out.print("*");
			}System.out.println("");
		}
		System.out.println("--------------------------");

		for(i=10;i>=1;i--){
			for(j=1;j<=i;j++){
				System.out.print("*");
			}System.out.println(" ");
		}
      }
}
