package finalKeywords;

public final class FinalEx1 {
	
	
	final int a=100;

	
	FinalEx1()
	{
		
	}
	public final void m1()
	{
		int a = 10;
		System.out.println(a);
		
	}
	public static void main(String args[])
	{
		FinalEx1 obj = new FinalEx1();
		obj.m1();
		System.out.println(obj.a);
	}

}
