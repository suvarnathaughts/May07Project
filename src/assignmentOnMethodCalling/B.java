package assignmentOnMethodCalling;
//method calling in different class without argument
public class B {
	
	public static void test1()
	{
		System.out.println("static test1 method from Class B");
	}
	public void test2()
	{
		System.out.println("NonStatic test2 method from Class B");
	}
	public static void main(String args[])
	{
		//for calling methods from Class A into Class B, Here we have to create object of Class A in Class B
		A obj = new A();
		A.m1();               // for static method ClassName.methodName();
		obj.m2();			 // for NonStatic method obj.methodName();
	}
}
