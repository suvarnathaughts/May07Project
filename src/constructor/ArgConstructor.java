package constructor;

public class ArgConstructor {
	
	 ArgConstructor()
	 {
		 System.out.println("I am Zero Arg Constructor");
	 }
	 ArgConstructor(int a)
	 {
		 System.out.println("I am int Arg Constructor");
	 }
	 ArgConstructor(float b)
	 {
		 System.out.println("I am float Arg Constructor");
	 }
	 ArgConstructor(char c)
	 {
		 System.out.println("I am char Arg Constructor");
	 }
	 ArgConstructor(String s)
	 {
		 System.out.println("I am String Arg Constructor");
	 }
	 
	 public static void main(String args[])
	 {
		 ArgConstructor obj =new ArgConstructor();
		 ArgConstructor obj1 =new ArgConstructor(10);
		 ArgConstructor obj2 =new ArgConstructor(10.5f);
		 ArgConstructor obj3 =new ArgConstructor('V');
		 ArgConstructor obj4 =new ArgConstructor("Hello");
		 
	 }
}
