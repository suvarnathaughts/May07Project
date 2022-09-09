package primitiveCasting;

public class ImplicitCastingEX1 {

	// lower size info converted into higher size info
	public static void main(String args[])
	{
		byte b = 124;
		byte c = 23;
		int d = b-c;
		System.out.println(d);
		
		char ch = 'h';
		int a =ch;
		System.out.println(a);
		
		float f = a;
		System.out.println(f);
		
		double v= ch;
		System.out.println(v);
	}
}
