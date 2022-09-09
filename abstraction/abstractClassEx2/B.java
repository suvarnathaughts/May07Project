package abstractClassEx2;

public class B extends A {

//	B() 
//	{
//		super(10);    if we wants to call argument constructor from parent class 
//		
//	}

	@Override
	public void m1() 
	{
		System.out.println("intialization of m1 abstract method from class A");
		
	}

	@Override
	protected void m2() 
	{
		System.out.println("intialization of m2 abstract method from class A");
		
		
	}

	@Override
	void m3() 
	{
		System.out.println("intialization of m3 abstract method from class A");
		
		
	}
	public static void t1()
	{
		System.out.println("we cannot override the static method "); // because overriding needs object to know is it overridden
	}
	public static void main(String args[])
	{
		B obj = new B();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
		t1();
	System.out.println(obj.a);
	
		
	}
	

}
