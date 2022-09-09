package assignmentOnOperators;

public class ArithOpEx1 
{
	public static void main(String args[])
	{
		int a = 10;
		int b = 20;
		float f = 234L;
		float f1 = 345L;
		double d1 = 567.89;
		double d2 = 456.89;
		byte b1 = 34;
		byte b2 = 17;
		short s1 = 100;
		short s2 = 50;
		long l1 = 60000;
		long l2 = 20000;
		System.out.println(a+b);     //30
		System.out.println(f*f1);	//80730
		System.out.println(d1-d2);	//111.0
		System.out.println(b1/b2);	//2
		System.out.println(s1/s2);	//2
		System.out.println(l1*l2);	//1200000000
		System.out.println(a%b);	//10
		System.out.println(s1%s2);	//0
		System.out.println(l1%b2);	//7
		System.out.println(b%s2);	//20
	}
}
