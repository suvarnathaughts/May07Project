package interviewQuestionsByAmarSir;
// can we declare multiple public classes in a single class
public class Nashik {
	
	public class A
	{
		public void m1()
		{
			System.out.println("hi");
		}
		
	}
	public class B
	{
		public void m1()
		{
			System.out.println("hello");
		}
		
	}
	public class C
	{
		
		public void m1()
		{
			System.out.println("hey");
		}
		
	}
	public static void main(String args[])
	{
		Nashik obj = new Nashik();
		Nashik.A obj1 = obj.new A();
		obj1.m1();
	}

}
