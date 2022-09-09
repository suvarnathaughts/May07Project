package myPack1;

public class A {
	
	public int a=10;
	private int b=12;
	protected int c=35;
	int d=24;
	public A(int a)
	{
		System.out.println("public constructor of class A");
	}
	private A()
	{
		System.out.println("private constructor of class A");
	}
	A(String s)
	{
		System.out.println("default access specifier constructor  of class A");
	}
	protected A(double d)
	{
		System.out.println("protected constructor  of class A");
	}
	public void m1()
	{
		System.out.println("public m1 method of class A");
	}
	private void m2()
	{
		System.out.println("private m2 method of class A");
	}
	protected void m3()
	{
		System.out.println("protected m3 method of class A");
	}
	void m4()
	{
		System.out.println("default m4 method of class A");
	}
	
	public static void main(String args[])
	{
		A obj = new A();
		
		obj.m2();
		System.out.println(obj.b);
	}
}
