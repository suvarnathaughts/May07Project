package assignmentOnPattern;

public class Pattern17 
{
	/*    54321
          *****
          *--*
          *-*
          **
          *
                           */


	public static void main(String args [])
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=i; j--)
			{
				if(i==1 || j==5 || j==i)
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
