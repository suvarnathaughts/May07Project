package assignmentOnConsructor;

public class Hobbies 
{
	String a;
	
	Hobbies(String s)
	{
		a = s;
	}
	public void m1()
	
	{
		System.out.println("My hobby is:"+a);
	}
	
	public static void main(String args[])
	
	{
		Hobbies obj = new Hobbies("Pencil Sketching");
		Hobbies obj1 = new Hobbies("Listening Song");
		Hobbies obj2 = new Hobbies("Wall decoration");
		Hobbies obj3 = new Hobbies("Gardening");
		obj.m1();
		obj1.m1();
		obj2.m1();
		obj3.m1();
	}
}
