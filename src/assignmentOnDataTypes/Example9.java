package assignmentOnDataTypes;
public class Example9 
{// boolean data type
	public void m1()
	{
		boolean b = 78>67;
		boolean b1 = 97<100;
		System.out.println(b);
		System.out.println(b1);
	}
	// byte data type
	public void m2()
	{
		byte a = 25;
		byte a1 = 5;
		byte a2 = (byte)(a*a1);
		System.out.println(a2);
	}
	// short data type
	public void m3()
	{
		short c = 456;
		short c1 = 567;
		short c2 = (short)(c+c1);
		System.out.println(c2);
	}
	//int data type
	public void m4()
	{
		int d = 1234455556;
		int d1 = 56677889;
		int d2 = d+d1;
		System.out.println(d2);
	}
	public static void main(String args[])
	{
		Example9 obj = new Example9();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
	}
}
