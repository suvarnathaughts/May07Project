package examplesOnsuper;

public class B extends A {
	
	int a = 100;
	
	public void m1()                
	{
		System.out.println(super.a);
		System.out.println(this.a);
	}
	
	
	public static void main(String args[])
	{
		B obj = new B();
		
		obj.m1();
	
		//System.out.println(obj.a);
	}

}
