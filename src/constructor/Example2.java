package constructor;

public class Example2     // Example of default constructor

{	int a= 10;
    String b = "Suvarna";
    

	
	public void m1()
	
	{
		System.out.println(a);
	}
	
	public static void main(String args[])
	
	{
		Example2 obj = new Example2();
		obj.m1();
		System.out.println(obj.b);
	}
}
