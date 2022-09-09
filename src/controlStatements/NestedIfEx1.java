package controlStatements;

public class NestedIfEx1 {
	
	// WAP to find out year is leap year or not
	public static void main(String args[])
	{
		
		int year = 1986;
		
		if(year%400==0)
		{
			if((year%100!=0)&&(year%4==0))
			{
				System.out.println("leap year");
			}
		}
		else
		{
			System.out.println("not leap year");
		}
		
	}
		
}



