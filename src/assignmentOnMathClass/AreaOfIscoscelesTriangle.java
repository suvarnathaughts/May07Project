package assignmentOnMathClass;

import java.util.Scanner;

public class AreaOfIscoscelesTriangle {
	
	public static void main(String args[])
	{
		  Scanner input = new Scanner(System.in);
		  System.out.println("Enter first side value: ");
		  int s1 = input.nextInt();
		  System.out.println("Enter second side value: ");
		  int s2 = input.nextInt();
		  
		  double area = (0.5)*s1*s2*Math.sin(0.7853);
		  
		  System.out.println(area);
		  
		  input.close();
		  
	}
}
