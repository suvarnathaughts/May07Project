package assignmentOnConsructor;

public class Country 
{   
	String s;
	
	// Zero argument Constructor
	
	Country()
	{
		s = "India";
	}
	
	public void m1()
	{
		System.out.println("My Country Name is:"+s);
	}
	
	public static void main(String args[])
	{
		Country obj = new Country();
		obj.m1();
	}
}

	
