package assignmentOnPattern;

public class Pattern16 {/*
	      54321
	          * 1           ----*
             ** 2           ---**
            * * 3   =       --*-*           blank spaces in row3, column2 & row4,colum2,3 
           *  * 4           -*--*
          ***** 5           *****
             
*/
      public static void main(String args[])
      {
    	  for(int i=1; i<=5; i++)
    	  {
    		  for(int j=4; j>=i; j--)
    		  {
    			  System.out.print(" ");
    		  }
    		  for(int k=1; k<=i; k++)
    		  {  if(i==5 ||k==1|| k==i)
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
