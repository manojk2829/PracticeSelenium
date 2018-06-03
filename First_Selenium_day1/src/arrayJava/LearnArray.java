package arrayJava;

public class LearnArray {

	public static void main(String[] args) {
		String[] str = new String[4];
		str[0] = "Manoj";
		str[1] = "Kushwaha";
		str[2] = "manoj@d2h.com";
		str[3] = "india";
		
		System.out.println(str.length);
		for(int i=0;i<str.length;i++)
		System.out.println(str[i]);
		
		int[] j = new int[3];
		j[0] = 188;
		j[1] = 234;
		j[2] = 321;
		System.out.println(j.length);
		for(int x=0;x<j.length;x++){
		   System.out.println(j[x]);
		}
		
		System.out.println("-----");
		for(int a=j.length-1;a>=0;a-- ){
			System.out.println(j[a]);
		}
		
		
	}

}
