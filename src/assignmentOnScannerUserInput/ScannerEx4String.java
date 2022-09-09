package assignmentOnScannerUserInput;

import java.util.Scanner;

public class ScannerEx4String {
	
	public static void main(String args[])
	{
		Scanner input = new  Scanner(System.in) ;
		
		System.out.print("Enter any Name:");
		
		String s = input.next();
		
		System.out.println("The given Name is "+s);
		
		// here I want characters from string
	    char ch1 =s.charAt(0);
	    System.out.println("The 1st character of "+ s +" is " +"'"+ch1+"'");
	    
		char ch2 = s.charAt(1);
		System.out.println("The 2nd character of "+ s +" is " +"'"+ch2+"'");
		
		char ch3 = s.charAt(2);
		System.out.println("The 3rd character of "+ s +" is " +"'"+ch3+"'");
		
		char ch4 = s.charAt(3);
		System.out.println("The 4th character of "+ s +" is " +"'"+ch4+"'");
		
		char ch5 = s.charAt(4);
		System.out.println("The 5th character of "+ s +" is " +"'"+ch5+"'");
		
		char ch6 = s.charAt(5);
		System.out.println("The 6th character of "+ s +" is " +"'"+ch6+"'");
		
		char ch7 = s.charAt(6);
		System.out.println("The 7th character of "+ s +" is " +"'"+ch7+"'");
		     
}

}
