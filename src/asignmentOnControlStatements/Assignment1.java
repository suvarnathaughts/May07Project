package asignmentOnControlStatements;

public class Assignment1 {
	
	// WAP to verify given year is Leap Year or not
	
	public static void main(String args[])
	{
		//int Year = 2000;                   // 2000 is a Leap year
		//int Year = 1700;                   // 1700 is not a Leap year
		//int Year = 1986;                   // 1986 is not a leap year
		//int Year = 2014;                   // 2014 is not a Leap year
		  
		int Year = 2024;
		  
		if ((Year%4==0)&&(Year%100!=0))
		{
			System.out.println(Year + " is a Leap Year");
		}
		else if(Year%400==0)
		{
			System.out.println(Year + " is a Leap Year");
		}
		else
		{
			System.out.println(Year + " is not Leap Year");
		}
		
	}

}
