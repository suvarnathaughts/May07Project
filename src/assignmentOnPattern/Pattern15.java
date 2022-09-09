package assignmentOnPattern;

public class Pattern15 {
	
	
	/*           *               *
	             **              **
	             * *       =     *-*                 blank space on row 3, column 2  & row 4, column 2,3
                 *  *            *--*
                 *****           *****
                                 12345



                                                    */
         public static void main(String args[])
         {
        	 for(int i=1;i<=5; i++)
        	 {
        		 for(int j=1; j<=i; j++)
        		 {
        			 if(j==1 || i==5 || i==j)
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
