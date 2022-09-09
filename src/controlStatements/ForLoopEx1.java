package controlStatements;

public class ForLoopEx1 {
	// WAP to find out factorial of 6.(6!= 6*5*4*3*2*1=720)
	
	public static void main(String args[])
	{
		int factorial = 1;
		
		for (int i=6;i>=1;i--)
		{
			factorial = factorial*i;
			
		}
		System.out.println(factorial);
	}

}
