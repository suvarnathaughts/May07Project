package assignmentOnScannerUserInput;

import java.util.Scanner;

public class PalindromString {

// WAP to check String is Palindrom String (mam == mam)
	
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = input.next();
		String org = s;
		String rev ="";
		
		int len = s.length();
		
		for(int i=len-1; i>=0; i--)
		{
			rev = rev+s.charAt(i);
		}
		
		if(org.equals(rev))
		{
			System.out.println("Given String "+org+" is Palindrom String");
		}
		else
		{
			System.out.println("Given String "+org+" is not a Palindrom String");
		}
		input.close();
	
			
	}
}
