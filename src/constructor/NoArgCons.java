package constructor;

public class NoArgCons {
	// no argument constructor
	NoArgCons()
	{
		System.out.println("I am no-arg constructor");
	}
	
	public static void main(String args[])
	{
		NoArgCons obj = new NoArgCons();
		NoArgCons obj1 = new NoArgCons();
		new NoArgCons();
	}
}
