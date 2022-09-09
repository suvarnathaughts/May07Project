package abstractClassEx2;
// lets have final keyword use
public final class C {   // if class is final so we cannot inherit it
	final int d;
	C()
	{
		d=20;	
	}
	public final void m1()   // we can use  final keyword for methods overriding is not possible
	{   //d+=;  we cannot change value of final variable it remains constant
		System.out.println("My name is Suvarna");
	}
	public final void m1(int b) //overloading is possible
	{
		System.out.println();
	}
	public final static void m2()
	{
		System.out.println();
	}
	public final static void m2(int a)
	{
		System.out.println();
	}
	
	public static void main(String args[])
	{
		
	}
}
