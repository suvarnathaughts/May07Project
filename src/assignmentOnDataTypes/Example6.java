package assignmentOnDataTypes;

public class Example6 

{
	public static void main(String args[])
	
	{
		Example6 obj = new Example6();
		obj.m1();
	}
	
	// float data type : Size = 4 byte, range = -3.4e38(-3.4*10^38) to 3.4e38(3.4*10^38)
	public void m1()
	
	{
		float a = 123.456f;   // at the end we can use F or f
		float b = 75698.45F; // at the end we can use F or f
		float c = a*b;
		float d = a/b;
		float e = a-b;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
	}
	
}
