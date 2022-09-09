package assignmentOnScannerUserInput;

import java.util.Scanner;

public class PrimeNumber {
	
	//WAP to find number is prime
	//for number to be prime , it must be greater than 1 and it has only two factors(1 and number itself)
    // we can say that it is completely  divisible by 1 and itself .
	
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = input.nextInt();
		int mod;
		int count=0;
		if(num>1)
		{  for(int i=1; i<=num;i++)
		      {
				mod =num%i;
				if(mod==0)
				{
					count++;
				}
		      }
		     if(count==2)
		     {
		    	 System.out.println("Given Number "+num+" is  a Prime Number");
		     }
		     else
		     {
		    	 System.out.println("Given Number "+num+" is not a Prime Number");
		     }
			
		}
		else
		{
			System.out.println("Given Number "+num+" is not a Prime Number");
		}
		input.close();
	}
}
