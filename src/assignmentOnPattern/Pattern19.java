package assignmentOnPattern;

public class Pattern19 {
	
	/*

             *                    ----    *1    
            *-*           ==      ---    *-2    *
           *---*                  --    *--3    -*
          *-----*                 -    *---4    --*
         *********                    *****5    ****
                                                 1234



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
			{   
				if(k==1 || i==5)
				{
				  System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			   
			}
			for(int l=2; l<=i; l++)
			{   
				if(i==5 || i==l)
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
