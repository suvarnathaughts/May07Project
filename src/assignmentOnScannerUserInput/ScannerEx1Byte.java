package assignmentOnScannerUserInput;

import java.util.Scanner;

public class ScannerEx1Byte {
	public static void main(String args[])
	{
		byte n=3, i, sum=0;
		
		for( i=1;i<=n;i++)
		{
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter number : ");
			
			byte a = input.nextByte();
			
			sum = (byte) (sum+a);
		}
		
		System.out.println("Sum of numbers is : "+sum);
}
	
}

