package datatypes;

public class NonPrimitiveDataType    // String Data Type

{
	public static void main(String args[])
	{
		NonPrimitiveDataType obj = new NonPrimitiveDataType ();
		obj.m1();
		
	}
	
	public void m1()
	{
		String a = "Hello! ";
		String b = "I ";
		String c = "am ";
		String d = "Suvarna ";
		String e = "Bhamare.";
		
		System.out.print(a);
		System.out.print(b);
		System.out.print(c);
		System.out.print(d);
		System.out.print(e);
		System.out.println(" ");
		System.out.println(a+b+c+d+e);
	
	}

}
