package assignmentOnPattern;

public class Pttern20 {
/*                              54321     4321
        *********               *****     ****
		 *-----*   ==    -       *---     --*
		  *---*          --       *--     -*
		   *-*           ---       *-     *
		    *            ----       *
		                                              */

	public static void main(String args[])
	{
		for(int i =1; i<=5; i++)
		{
			for(int j=2; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int k=5; k>=i; k--)
			{   if(i==1 || k==5 )
			    {
				System.out.print("*");
				}
			    else
			      {System.out.print(" ");}
			}
			for(int l =4; l>=i; l--)
			{    
				if(l==i || i==1) 
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
