package assignmentOnPattern;

public class Pattern18 {
	
	
	/*    54321           
       (i)*****1                  
          -*--*2                     here spaces are for row 2 column3,4
          --*-*3                                        row3   column4
          ---**4
          ----*5


 
                                                  */
public static void main(String args[])
{
      for(int i=1; i<=5; i++)
      {
    	  for(int j=1; j<=i; j++)
    	  {
    		  System.out.print(" ");
    	  }
    	  for(int k=5; k>=i;k--)
    	  {
    		  if(i==1 || k==5 || i==k)
    		  {
    			  System.out.print("*");
    		  }
    		  else
    		  {
    			  System.out.print(" ");
    		  }
    	  }
    	  System.out.println();
      }
        




}




}
