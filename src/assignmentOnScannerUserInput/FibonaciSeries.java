package assignmentOnScannerUserInput;

import java.util.Scanner;

public class FibonaciSeries {
// WAP to generate fibonacci series
	
	// fibonacci means number is addition of previous two numbers
	// 0 1 1 2 3 5 8 13 21 34
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter num1:");
		int num1 = input.nextInt();
		System.out.print("Enter num2:");
		int num2 = input.nextInt();
		System.out.print(num1+" "+num2);
		
		for(int i=1;i<=7;i++)
		{
			int sum = num1+num2;
			num1= num2;
			num2 = sum;
			System.out.print(" "+sum);
		}
		input.close();
		
	}
}
