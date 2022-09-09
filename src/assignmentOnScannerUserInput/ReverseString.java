package assignmentOnScannerUserInput;

import java.util.Scanner;

public class ReverseString {
// WAP to reverse a string
	
	public static void main(String args [])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s = input.next();
		int len = s.length();
		String rev = "";
		
		for(int i = len-1;i>=0; i-- )
		{
			rev = rev+s.charAt(i);
		}
		System.out.println("Reversed String is: "+rev);
		input.close();
		
	}
	

}
