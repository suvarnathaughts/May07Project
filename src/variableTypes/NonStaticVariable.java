package variableTypes;

public class NonStaticVariable {
	
	int a = 25;                // here a,b are non-static or global variables
	int b = 65;
	
	public static void main(String args[])
	{
		//int e = a+b;        // here we cannot access global variables inside main method directly there is need to create object
		
		NonStaticVariable obj = new NonStaticVariable();
		obj.test2();
		System.out.println(obj.a);
		System.out.println(obj.b);
	}
	
	public static void test1()
	
	{
		//int c = a+b;      // here we cannot access global variables inside static method
	}
	
	public void test2()
	
	{
		int d = a*b;       // here we can access global variable inside non static method
		
		System.out.println(d);
	}
	

}

