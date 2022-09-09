package constructorChaining;

public class Child extends Parent {
	
	Child(int a) 
	{
		super(a);
    }
	

	public static void main(String args[])
	{
		
	  Child obj = new Child(10);
		
	}

}
