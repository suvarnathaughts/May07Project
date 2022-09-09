package assignmentOnScannerUserInput;

import java.util.Scanner;

public class Factorial {
	
	//WAP to find out factorial of 5!(5*4*3*2*1)
	
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter num value: ");
		 
		int num = input.nextInt();
		
		int mul =1; int factorial;
		
		for(int i=1; i<=num;i++)
		{
			
			mul= mul*i;
		}
		
		factorial=mul;
		
		System.out.println("Factorial of "+num +" is :"+factorial);
		input.close();
	}

}
