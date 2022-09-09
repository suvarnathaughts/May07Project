package assignmentOnScannerUserInput;

import java.util.Scanner;

public class Average {
	
	// WAP to find out average of numbers
	
	public static void main(String args[])
	{
		double n=10,i,j,sum=0;
		double avg;
		
		Scanner input = new Scanner(System.in);
		
		for(i=1;i<=n;i++)
		{   
			System.out.print("Enter Number : ");
			
			j= input.nextInt();
			
			sum = sum+j;
		}
		  
		    avg = sum/n;
		    
		    System.out.println("avg is: "+avg);
		    
	
		    
		    
		    
    }
	
	    

}
