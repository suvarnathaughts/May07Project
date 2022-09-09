package controlStatements;

public class IfElseLadderEx4 {
	// WAP to find out actual price after discount
	//for less than 2000rs-5%, 2001 to 5000-25%, 5001 to 10000-35%, above 10000- 50%
	public static void main(String args[])
	{
		int tc = 2500;
		
		if (tc<=2000)
		{
			float ac =tc - (tc*0.05f);
			System.out.println(ac);
		}
		else if(tc<=5000)
		{
			float ac = tc - (tc*0.25f);
			System.out.println(ac);
		}
		else if(tc<=10000)
		{
			float ac = tc - (tc*0.35f);
			System.out.println(ac);
		}
		else
		{
			float ac = tc-(tc*0.5f);
			System.out.println(ac);
		}
		
	}
}
