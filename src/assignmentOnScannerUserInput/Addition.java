package assignmentOnScannerUserInput;

import java.util.Scanner;

public class Addition {
public static void main(String args[])
{
	int n=10;
	int i=1;
	int addition=0;
	Scanner input = new Scanner(System.in);

	for (i=1;i<=n;i++)
	{
	     System.out.print("Enter Number : ");
	     int a = input.nextInt();
	     addition = addition+a;
	     
	}
	System.out.println("Addition of Numbers from user is: "+addition);
	
}

}