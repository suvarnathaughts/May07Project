package assignmentOnScannerUserInput;

import java.util.Scanner;

public class ScannerEx3Short {
	
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a value: ");
		
		short a = input.nextShort();
		
		System.out.print("Enter b value: ");
		
		short b = input.nextShort();
		
		short c = (short) (a*b);
		
		System.out.println("Multiplication of a and b is : "+c);
		
	}

}
