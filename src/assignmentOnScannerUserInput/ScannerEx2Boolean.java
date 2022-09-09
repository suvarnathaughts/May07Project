package assignmentOnScannerUserInput;

import java.util.Scanner;

public class ScannerEx2Boolean {
	public static void main(String args [])
	{ Scanner input = new Scanner(System.in);
	 
	 System.out.print("Enter a Value: ");
	 
	 int a = input.nextInt();
	 
	 System.out.print("Enter b Value: ");
	 
	 int b = input.nextInt();
	 
	 System.out.print("Enter c Value: ");
	 
	 boolean c = input.nextBoolean();
	 
	 if (c==true)
	 {
		 int sum= a+b;
		 System.out.println(sum);
	 }
	 else
	 {
		 int sub= a-b;
		 System.out.println(sub);
	 }

   }
}
