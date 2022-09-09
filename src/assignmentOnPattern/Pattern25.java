package assignmentOnPattern;

public class Pattern25 {
	
/*   
     *****           *****          here no.of rows = no.of column     
      *   *          -*---*                 column is independent of row
       *   *       = --*---*
        *   *        ---*---*
         *****       ----*****          */
       public static void main(String args[])
        {
	       for(int i=1; i<=5; i++)
	       {
	    	   for(int j=1; j<=i; j++)
	    	   {
	    		   System.out.print(" ");
	    	   }
	    	   for(int k=1; k<=5; k++)
	    	   {   if(i==1 || i==5 || k==1 || k==5)
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
