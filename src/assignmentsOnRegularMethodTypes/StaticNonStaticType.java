package assignmentsOnRegularMethodTypes;

public class StaticNonStaticType {
	
	
	public static void main(String args [])
	{
		System.out.println("I am main method");
		
		StaticNonStaticType.method1();
		
		StaticNonStaticType obj = new StaticNonStaticType();
		
		obj.method2();
		
	}
	
	
	public static void method1()
	{
		System.out.println("I am Static method");
	}
	
	public void method2()
	{
		System.out.println("I am Non-Static method");
	}

}
