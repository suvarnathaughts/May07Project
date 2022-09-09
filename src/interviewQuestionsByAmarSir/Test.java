package interviewQuestionsByAmarSir;
// can we have multiple classes in a single class
 class  A     // outer class

{
	class B   // inner class
	{
		public void m1()
		{
			System.out.println("method m1 of inner parent class B");
		}
	}
	class C extends B  // inner class
	{
		public void m2()
		{
			System.out.println("method m2 of inner child class C");
		}
	}
	
	
}
 
public class Test
{   public static void main(String args[])
	{ A obj = new A();
	  A.C obj2 = obj.new C();
	  obj2.m1();
	  obj2.m2();
	}

}


