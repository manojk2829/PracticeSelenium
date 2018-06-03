package August_Base_Package;

public class pp {

	public static void main(String[] args) {
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
			   

	}

}
