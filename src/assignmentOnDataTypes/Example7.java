package assignmentOnDataTypes;

public class Example7 

{
	
	public static void main(String args[])
	{
		Example7 obj = new Example7();
		obj.m1();
	}
	
	// double data type: size = 8 byte, range = -1.7e308(-1.7*10^308) to 1.7e308(1.7*10^308)
	
	public void m1()
	{
		double a = 123456789.567897888;
		double b = 345678923.123456789;
		double c = a*b;
		double d = a/b;
		
        System.out.println(c);
        
		System.out.println(d);
		
	}

}
