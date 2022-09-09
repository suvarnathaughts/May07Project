package asignmentOnControlStatements;

public class Assignment2 
{   // WAP to check the given character is Vowel or not
	public static void main(String args[])
	{
		//char ch = 'u';
		//char ch = 'U';
		char ch = 'B';
		
		if ((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
		{
			System.out.println("Given Character "+ch+" is Vowel.");
		}
		else if ((ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'))
		
		{
			System.out.println("Given Character "+ch+" is Vowel.");
		}
		else
		{
			System.out.println("Given Character "+ch+" is Consonant.");
		}
	}
}	