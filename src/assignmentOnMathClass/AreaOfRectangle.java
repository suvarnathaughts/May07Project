package assignmentOnMathClass;

import java.util.Scanner;

public class AreaOfRectangle {
	//WAP to calculate area of Rectangle
	

	public static void main(String args[])
	{   Scanner input = new Scanner(System.in);
		System.out.println("Enter the length value: ");
		double length = input.nextDouble();
		System.out.println("Enter the width value: ");
		double width = input.nextDouble();
		
		double area = length*width;
		
		System.out.println("Area of rectangle is: "+area);
	}

}
