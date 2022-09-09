package assignmentOnPattern;

public class Pattern29 {
	
	
	/*
     * * * * *                   * * * * * 
      *     *                     * - - * 
       *   *                       *-  *                after removing spaces of first pattern 
        * *                         **
         *             =             *
        * *                         **
       *   *                       *-*
      *     *                     *--*
     * * * * *                   *****

                                                                          */

public static void main(String args[])
{
for(int i=1; i<=5; i++)
{
	for(int j=2;j<=i;j++)
	{
		System.out.print(" ");
	}
	for(int k=5;k>=i;k--)
	{   if(k==5||i==1||i==k)
	     {
		System.out.print("* ");
	     }
	   else
	   {
		   System.out.print("  ");
	   }
	
	}
	System.out.println();
}
for(int i=2;i<=5;i++)
{
  for(int j=4;j>=i;j--)	
  {
	  System.out.print(" ");
  }
  for(int k=1;k<=i;k++)
  {   if(k==1||i==5||k==i)
	  {
	     System.out.print("* ");
	  }
      else 
      {
    	  System.out.print("  ");
      }
  }
  System.out.println();
}



}
}



