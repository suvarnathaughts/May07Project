package assignmentOnPattern;

public class Pattern22 {/*
	
     *                  *              *--*
     **                 **             *-*
     *-*                *-*      +     **
     *--*               *--*           *
     *---*  =           *---*     
     *--*
     *-*
     **
     *
 
                              
                               */
	
	
	
	
	public static void main(String args[])
    {
 	   for(int i=1; i<=5; i++)
 	   {
 		   for(int j=1;j<=i;j++)
 		   {  if(j==1 || j==i)
 			   System.out.print("*");
 		   else {System.out.print(" ");}
 		   }
 		   System.out.println();
 	  }
 	   for(int i=1; i<=4; i++)
 	   {
 		   for(int j=4; j>=i; j--)
 		   {   if(j==4 || j==i)
 			   System.out.print("*");
 		   else System.out.print(" ");
 		   }
 		   System.out.println();
 	   }
    }
	
	
	

}
