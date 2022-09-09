package hirarchyInheritance;

public class Master {
	
	public static void main(String args[])
	{
		B obj = new B();
		C obj1 = new C();
		
		obj.m1();
		obj.m2();
		
		obj1.m1();
		obj1.m3();
	}

}
