package myPack2;

import myPack1.A;

class C extends A {

	public C(int a) 
	{
		super(a);
		
	}
	protected C(double d)
	{
		super(d);
	}
	public static void main(String args [])
	{   System.out.println("ouside package myPack1:");
	    System.out.println();
		System.out.println("constructor");
	    C obj6= new C(10);
	    C obj7 = new C(6.7);
	    System.out.println();
	    System.out.println("methods: ");
	    obj6.m1();
	    obj6.m3();
	    System.out.println();
		System.out.println("Variables: ");
		System.out.println();
		System.out.println(obj6.a);
		System.out.println(obj6.c);
		
		
		
	}

	
	

}
