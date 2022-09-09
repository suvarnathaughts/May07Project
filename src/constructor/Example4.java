package constructor;

public class Example4 
{
	static int a;
	static float b;
	
	Example4()
	{
		a = 20;
		b = 30;
	}
	Example4(String z)
	{
		a = 50;
		b = 50;
	}
	public static void test1()
	{
		System.out.println(" ");
		System.out.println(a+b);
		System.out.println(a-b);
	}
	public void test2()
	{
		System.out.println(a*b);
		System.out.println(a/b);
	}
	public static void main(String args[])
	{
		//for zero argument constructor
		//Example4 obj = new Example4();
		new Example4();
		test1();
		//obj.test2();
		//for argument constructor
		//Example4 obj1 = new Example4("hi");
		new Example4("hi");
		test1();
		//obj1.test2();
		
	}
}
