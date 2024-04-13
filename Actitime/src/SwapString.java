
public class SwapString {

	public static void main(String[] args) {
		String a = "one";
		String b ="two";
		
		/* a = a+b;
		b= a.substring(0,(a.length()-b.length()));
		a= a.substring(b.length());*/
		a=a+b;
		System.out.println(a);
		b=a.replace(b, "");
		System.out.println(b);
		a=a.replace(b, "");
		System.out.println(a);

		
		System.out.println( "a =" + a);
		System.out.println("b = " + b);
	} 

}
