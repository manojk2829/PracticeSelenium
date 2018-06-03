package arrayJava;

public class cunstructorClass {
	
     public static void main(String[] args) {
    	 AA c=new AA(6);
    	 AA c1=new AA();
     }
}

class AA{
	public AA(int s){
		System.out.println(s +" Parameter");
	}
	
	public AA(){
		System.out.println("Default");
	}
}
     
