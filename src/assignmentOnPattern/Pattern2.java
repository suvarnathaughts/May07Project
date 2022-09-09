package assignmentOnPattern;

public class Pattern2 {/*
	       ----*
	       ---**
	       --***
	   	   -****
	       *****               */


public static void main(String args[])
{
	// rows=i, column=j; spaces = k

      for (int i =1; i<=5; i++)      // for rows
      {
    	  for (int j=4;j>=i;j--)     // for spaces
    	  {
    		  System.out.print(" ");
    	  }
    	  for (int k=1; k<=i;k++)
    	  {
    		  System.out.print("*");
    	  }
    	  System.out.println();
      }
}




}
