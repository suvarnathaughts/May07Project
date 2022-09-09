package variableTypes;

public class StaticVariable 
{
    static int a = 50;     // here a,b are static variables or class variables
	static int b = 70;
	
	public static void main(String args[])
	{
		int e = a+b;                   // we can access static variable inside main method
		System.out.println(e);
		
		test1();
		
	    StaticVariable	obj = new StaticVariable();
	    
	    obj.test2();
	}
	
	public static void test1()
	{
		int c = a*b;                 // we can access static variable inside static method
		System.out.println(c);
	}

	public void test2()
	{
		int d = b-a;                 // we can access static variable inside non-static method
		System.out.println(d);
	}

}




