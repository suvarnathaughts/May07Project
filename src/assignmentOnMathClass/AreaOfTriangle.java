package assignmentOnMathClass;

import java.util.Scanner;

public class AreaOfTriangle {
	
	// WAP to find out area of Right angle Triangle  = 1/2 base*height
	
	public static void main(String args[])
	{   Scanner input = new Scanner(System.in);
		System.out.println("Enter the base value: ");
		double base = input.nextDouble();
		System.out.println("Enter the height value: ");
		double height = input.nextDouble();
		
		double area = 0.5*base*height;
		
		System.out.println("Area of triangle is: "+area);
		
	}

}
