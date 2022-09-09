package operators;

public class RelationalOperator 
{
	public static void main(String args[])
	{
		int a = 50;
		int a1 = 78;
		byte b1 = 56;
		byte b2 = 90;
		short s1 = 120;
		short s2 = 67;
		long l1 = 23456L;
		long l2 = 67890L;
		long l3 = 50;
		char c1 = 89;
		char c2 = 87;
		float f1 = 67.9f;
		float f2 = 56.9f;
		double d1 = 67.9;
		double d2 = 679.943;
		System.out.println(a<a1);  //true
		System.out.println(b1>b2); //false
		System.out.println(s1<=s2); //false
		System.out.println(l1>=l2); //false
		System.out.println(c1==c2); //false
		System.out.println(f1!=f2); //true
		System.out.println(d1>d2);  //false
		System.out.println(l1>a);   //true
		System.out.println(f1==d1);	//false
		System.out.println(a==l3);	//true
		}

}
