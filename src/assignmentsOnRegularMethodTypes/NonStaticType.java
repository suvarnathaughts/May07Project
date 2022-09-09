package assignmentsOnRegularMethodTypes;

public class NonStaticType {
	
	public static void main(String args[])
	{
		
		System.out.println("I am Main Method");
		
		NonStaticType obj1 = new NonStaticType();
		NonStaticType obj2 = new NonStaticType();
		
		obj1.method1();
		obj2.method2();
		
	}
	
	
	public void method1()
	{
		System.out.println("I am Non-Static Method1");
	}
	
	public void method2()
	{
		System.out.println("I am Non-Static Method2");
	}

}
