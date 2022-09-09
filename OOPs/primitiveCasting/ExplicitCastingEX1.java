package primitiveCasting;

public class ExplicitCastingEX1 {
	// higher size info converted into lower size info
	
	public static void main(String args[])
	{
		int a =127;
		byte b=(byte) a;
		
		System.out.println(b);
		
		float f = 97.6f;
		char ch =(char) f;
		System.out.println(ch);
		
		double d = 1234.5678;
		int i =(int) d;
		System.out.println(i);
	}

}
