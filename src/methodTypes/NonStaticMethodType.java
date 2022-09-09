package methodTypes;

public class NonStaticMethodType {
	
	public static void main(String args [])
	
	{
		
		System.out.println("I am main method");
		
		NonStaticMethodType a = new NonStaticMethodType();
		
		a.test();
		
		
	}
	

	public void test()
	{
		
		System.out.println("I am test Non Static Method");
	}
	
}
