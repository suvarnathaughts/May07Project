package constructorChaining;

public class A {
	
	A(double d)
	{   
		this(10);
		System.out.println("This is double arg constructor");
	}
	A(int i)
	{
		this("Hi");
		System.out.println("This is int arg constructor");

	}
	A(String s)
	{
		this();
		System.out.println("This is String arg constructor");

	}
	A()
	{
		System.out.println("This is Zero arg constructor");

	}
	public static void main(String args[])
	{
		A obj = new A(19.78);
		System.gc();
		
		
	}

}
