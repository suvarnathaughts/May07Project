package assignmentOnLoopingStements;

public class ForLoopEx4 {
	
	// WAP to swap two numbers
	
	public static void main(String args[])
	{
		int a = 345;
		int b = 789;
		System.out.println("Numbers before swapping");
		System.out.println(a);   //345
		System.out.println(b);   //789
		
		int c=a;
		    a=b;
		    b=c;
		System.out.println("Numbers after swapping");
		System.out.println(a);    //789
		System.out.println(b);    //345
		    
	}
	

}
