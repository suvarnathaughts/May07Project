package assignmentOnPattern;

public class Pattern27 {
	public static void main(String aargs[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int k=5; k>=i; k--)
			{
				System.out.print("*");
			}
			for(int k=2; k<=i; k++)
			{
				System.out.print(" ");
			}
			for(int k=2;k<=i; k++)
			{
				System.out.print(" ");
			}
			for(int k=5;k>=i; k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=5; i++)
		{
			for(int j=1;j<=10;j++)
			{ 
				if(j==1||i==5||j==10||(i==2&&(j==2||j==9))||(i==3&&(j==2||j==3||j==8||j==9))||((i==4&&(j==2||j==3||j==4||j==7||j==8||j==9))))
						
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
	
	