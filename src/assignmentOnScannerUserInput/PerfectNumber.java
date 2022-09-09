package assignmentOnScannerUserInput;

import java.util.Scanner;

public class PerfectNumber {
// WAP to find given number is perfect
	// number is perfect means its factors addition is equal to number
	// 6 = 1*2*3
	//    = 1+2+3= 6
	
	public static void main(String args[])
	{   
		int sum = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Number: ");
		
		int num = input.nextInt();
		
		for(int i=1; i<num; i++)
		{   
			int mod = num%i;
		
			if(mod==0)
			{
				sum = sum+i;
			}
		}
		System.out.println("The sum of factors: "+sum);
		if(num==sum)
		{
			System.out.println("Given number is Perfect number");
		}
		else
		{
			System.out.println("Given number is not a Perfect number");
		}
		input.close();
	}

}
