package assignmentOnScannerUserInput;

import java.util.Scanner;

public class CountVowel {
	
// WAP to count no.of vowels of the string
	
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter String: ");
		String s = obj.nextLine();
		int length = s.length();
		int count =0;
		for(int i=0; i<=length-1;i++)
		{
			char ch = s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				count++;
			}
		}
		System.out.println(count);
		obj.close();
	}

	
}
