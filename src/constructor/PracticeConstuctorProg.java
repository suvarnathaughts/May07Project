package constructor;

public class PracticeConstuctorProg {
	
	String name;
	
	PracticeConstuctorProg()
	{
		name = "Shivlila";
	}
	PracticeConstuctorProg(String a)
	{
		name = "Vinod";
	}
	public void display()
	{
		System.out.println(name);
	}
	public static void main(String args[])
	{
		PracticeConstuctorProg obj = new PracticeConstuctorProg();
		PracticeConstuctorProg obj1 = new PracticeConstuctorProg("hi");
		obj.display();
		obj1.display();
	}
}
