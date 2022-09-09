package classInClass;
 class Test
{
	int a=10;


}

class Sample extends Test
{
	
	int a=50;
	public void m1()
	{
		System.out.println(super.a);
	}
	
}
public class Master
{
	public static void main(String args [])
	{
		Sample s= new Sample();
		s.m1();
		System.out.println(s.a);
		
	}
}
