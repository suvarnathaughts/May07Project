package interfaceEx1;

public class Implementation implements Vehicle{

	@Override
	public void m1() 
	{
		System.out.println("m1");
		
	}

	@Override
	public void m2() 
	{
		System.out.println("m2");
		
	}
	public static void main(String args[])
	{
		Implementation obj = new Implementation();
		obj.m1();
		obj.m2();
		System.out.println(Vehicle.a);
	}

}
