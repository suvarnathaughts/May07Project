package assignmentOnDataTypes;

public class Example5 

{
	public static void main(String args[])
	
	{
	    Example5 obj = new Example5();
		
		obj.m1();
		
	}
	
	// long Data type: size = 8byte, range = -2^63 to 2^63 -1
	
	public void m1()
	
	{
		long a = 9421412495L; // at the end we can use L or l
		long b = 7741026459l; // at the end we can use L or l
		long c = a+b;
		long d = a-b;
		
		System.out.println(c);
		
		System.out.println(d);
		
		}
}
