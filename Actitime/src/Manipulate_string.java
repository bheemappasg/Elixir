
public class Manipulate_string {

	public static void main(String[] args) 
	{
		String s1 = "Water";
		String s2 = "Bottle";
		System.out.println(s2.replaceFirst("",s1.substring(0, 3))+s1.substring(s1.length()-3,s1.length()));
		
	
		}

}
