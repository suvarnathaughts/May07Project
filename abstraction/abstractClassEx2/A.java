package abstractClassEx2;

public abstract class A {
	 int a=25;
	 final int b=20;
	//public static abstract void m1();    we cannot declare abstract keyword for static method
	 
     public abstract void m1();
     protected abstract void m2();
     abstract void m3();
     final void m4()
     {
    	System.out.println("final method declarartion"); 
     }
    //private abstract void m4();       we cannot declare private method as a abstract method, because abstract method needs to implemented in other class
     A(int a)
     {                                  // we cannot make constructor as a abstract
    	a=10;
    	System.out.println("a=10 we can declare constructor inside abstract class");
     }
     A()
     {
    	 a=20;
    	 System.out.println(" a= 20 we can declare constructor inside abstract class");
     }
   
     
     public static void t1()
     {
    	 System.out.println("we can declare public static method inside abstract class");
     }
     protected static void t2()
     {
    	 System.out.println("we can declare protected static method inside abstract class");
     }
     static void t3()
     {
    	 System.out.println("we can declare default static method inside abstract class");
     }
     private static void t4() // we can declare private static method inside abstract class but we cannot use it
     {
    	 System.out.println("we can declare private static method inside abstract class");
     }
     public static void main(String args[])  // we can declare main method inside abstract class
     {   //A obj = new A();  we cannot create object of abstract class
    	 A.t4();
    	 A.t1();
    	 A.t2();
    	 A.t3();
     }
}
