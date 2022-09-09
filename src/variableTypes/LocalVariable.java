package variableTypes;

public class LocalVariable 

{
	
	public static void main(String args [])
	{
		//int d = a*b;   if we try to access local variable outside of the method(test1) in which they are declared it gives us error
	
		test1();    // way to call static method
		
		LocalVariable obj = new LocalVariable();   // way to call non static method
		
		        obj.test2();
	}
	
	

	public static void test1()
	{
		int a = 10;         // here a,b,c are local variable of test1 method
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	
	public void test2()
	{
		//int e = a-b;   if we try to access local variable outside of the method(test1) in which they are declared it gives us error
	
		byte f = 23;      //here f,g,h are Local variable of test2 method 
		byte g = 34;
		byte h =(byte) (f+g);
		System.out.println(h);
	}
	
	
}
