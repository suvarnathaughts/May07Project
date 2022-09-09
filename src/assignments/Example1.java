package assignments;

public class Example1 
{   // Declaration
	
	int a;
	int b;
	static char ch;
	static String s;
	
	Example1()                       // User define constructor
	
	{  
		// Initialization
		a = 25;
		b = 75;                 
		ch = 'A';
		s = "Hello Java";
	}
	
	public void test1()
	
	{
		// usage
		
		int c = a*b;
		System.out.println("Output of Non-Static method test1():");
		System.out.println(c);
		System.out.println(ch);
		System.out.println(s);
		System.out.println(" ");
		
	}
	
	public static void test2()
	
	{    // Usage
		
		 System.out.println("Output of Static method test2():");
		 System.out.println(ch);
		 System.out.println(s);
	}
	
	public static void main(String args[])
	
	{   // Usage
		
		Example1 obj = new Example1();
		int f = obj.b /obj.a;
		System.out.println("Output of main() method:");
		System.out.println(f);
		System.out.println(ch);
		System.out.println(s);
		System.out.println(" ");
		obj.test1();
		test2();
		
	}

}
