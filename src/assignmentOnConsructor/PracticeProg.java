package assignmentOnConsructor;

public class PracticeProg 
{
	int a;                  
	String b;
	
	PracticeProg()
	{
		a = 50;
	}
	PracticeProg(String c)
	{
		b = "hi";
	}
	public void test()
	{
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String args[])
	{
		PracticeProg obj = new PracticeProg();
		obj.test();
		PracticeProg obj1 = new PracticeProg("ghg");
		obj1.test();
	}
}
