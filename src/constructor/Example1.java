package constructor;

public class Example1 
{
	int a;
	int b;
	
	Example1()          // User Defined Constructor
	
	{
		a = 20;
		b = 30;
		
	}

	public static void main(String args[])
	
	{
		Example1 obj = new Example1();
		
		System.out.println(obj.a);
		
		System.out.println(obj.b);
		
	}

}
