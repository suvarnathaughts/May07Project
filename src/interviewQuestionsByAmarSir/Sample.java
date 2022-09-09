package interviewQuestionsByAmarSir;

public class Sample 
{  public static void main(String args [])
	{
	   G obj = new G();
	     obj.m1();
	   B obj1 = new B();
	     obj1.m2();
	   C obj2 = new C();
	     obj2.m3();
	
	}
   
}

class G
{
	public void m1()
	{
		System.out.println("m1 method of classG");
	}
}

class B
{

	public void m2()
	{
		System.out.println("m2 method of classB");
	}


}
class C
{

	public void m3()
	{
		System.out.println("m3 method of classC");
	}

}
