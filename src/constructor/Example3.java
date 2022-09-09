package constructor;

public class Example3

{
	int a;             // Declaration
	char ch;
	boolean b;
	float f;
	
	Example3()
	
	{
		a = 10;          // Initialization
		ch = 'a';
		b = true;
	}
	
	public static void main(String args[])         // usage
	
	{
		Example3 obj = new Example3();            // here object creation is needed because a,ch,b,f are Global variables
		
		System.out.println(obj.a);
		
		System.out.println(obj.ch);
		
		System.out.println(obj.b);
		
		System.out.println(obj.f);               // here f will give default value because we had not initialize it
		
	}

}
