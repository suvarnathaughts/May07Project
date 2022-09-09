package myPack1;

 class B {
	public static void main(String args[])
	{
	 System.out.println("outside class A: ");
	 System.out.println();
	 System.out.println("constructors: ");
	 System.out.println();
	 A obj3 = new A("s");
	 A obj4 = new A(10);
	 A obj5 = new A(9.6);
	 System.out.println();
	 System.out.println("methods: ");
	 System.out.println();
	 obj3.m1();
	 obj4.m3();
	 obj5.m4();
	 System.out.println();
	 
	 System.out.println("variables");
	 System.out.println(obj3.a);
	 System.out.println(obj3.c);
	 System.out.println(obj3.d);
	 
  } 

}
