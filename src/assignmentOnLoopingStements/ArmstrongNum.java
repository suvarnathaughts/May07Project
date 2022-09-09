package assignmentOnLoopingStements;

import java.util.Scanner;

public class ArmstrongNum {
	// write a program to find out given no.is Armstrong number
	public static void main(String args[])
	{   
		Scanner input = new Scanner(System.in);
	
	    System.out.print("Enter any number: ");
		
	    int num =input.nextInt();
	
		int mod = 0;
		int originalNum = num;
		int mul;
		int sum= 0;
		
		while(num>0)
		{
			mod = num%10;
			mul = (mod*mod*mod);
			sum = sum+mul;
			num = num/10;
		}
		
		if(originalNum==sum)
		{
			System.out.println("Given number "+originalNum+ " is Armstrong Number");
		}
		else
		{
			System.out.println("Given number "+originalNum+ " is not an Armstrong Number");
		}
		input.close();
	}

}
