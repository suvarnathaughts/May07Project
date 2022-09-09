package compileTimePolymorphism;

public class MethodOverloading {
	public void m1()
	{
		System.out.println("No arg method");
	}
	public void m1(int a)
	{
		System.out.println("int arg method");
	}
	public void m1(String b)
	{
		System.out.println("String arg method");
	}
	public void m1(byte c)
	{
		System.out.println("byte arg method");
	}
	
	public static void main(String args[])
	{
		MethodOverloading obj = new MethodOverloading();
		
		obj.m1();
		obj.m1(8);
		obj.m1("go");
		obj.m1(6);
	}

}
