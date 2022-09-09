package interfaceEx1;

public interface Vehicle {
	
	int a=20;   // by default it is public static final
	
//	Vehicle()   // we cannot declare constructor inside interface
//	{
//		
//	}
	
	void m1();      // here compiler by default provide public abstract keywords
	void m2();
	public static void m3()
	{
		System.out.println("Static method");
	}
	default void m4()   // here we need to explicitly write default keyword
	{
		
	}
	private static void m5()
	{
		
	}
    //protected void m6() // protected method not allowed
//	{
	//		
//	}
	public static void main(String args [])
	{System.out.println(a);
	  m3();
	
	}

}
