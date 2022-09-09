package assignmentOnDataTypes;

public class Example2 
{
	public static void main(String args[] ) 
	{
		
		Example2 obj = new Example2();
				
		obj.m1();
		
				
	}

	// Byte DataType :Size 1 byte, range: -128 to 127
	
	public void m1()
	
	{
		byte a = 24;
		byte b = 100;
	//byte c =  (a+b); [it shows error and give suggestion(fix) : add cast to byte i.e. (byte)]
		byte c = (byte) (a+b);
		byte d = (byte) (a-b);
		
		
		System.out.println(c);
		
		System.out.println(d);
	
	}
	
}
