package controlStatements;

public class IfElseLadderEx1 {
	// WAP to find out maximum/ largest of three number(45,89,67)
	public static void main(String args[])
	{
		int a = 45;
		int b = 89;
		int c = 67;
		
		if ((a>b)&&(a>c))
		{
			System.out.println(a+ " is maximum of all three.");
		}
		else if((b>a)&&(b>c))
		{
			System.out.println(b+ " is maximum of all three.");
		}
		else
		{
			System.out.println(c+ " is maximum of all three.");
		}
	}

}
