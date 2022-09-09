package assignmentOnDataTypes;
public class Example10 
{   // long data type 
	public void m1()
	{	long a = 1233445555L;
		long a1 = 45567788899L; 
		long a2 = a+a1;
		System.out.println(a2);
	}
	// float data type
	public void m2()
	{	float b = 455677.455666f;
		float b1 = 5666778.89999f;
		float b2 = b+b1;
		System.out.println(b2);
	}
	// double data type 
	public static void m3() 
	{   double d = 455667777888.445566777;
		double d1 = 455666677.7888888;
		double d2 = d+d1;
		System.out.println(d2);
	}
	// char data type
	public static void m4()
	{   char ch = 'a';
		System.out.println(ch);
	}
	//String data type
	public static void m5()
	{
		String s = "Velocity";
		System.out.println(s);
	}
	public static void main(String args[])
	{	m3();
		m4();
		m5();
		Example10 obj= new Example10();
		obj.m1();
		obj.m2();
		}
}

