package assignmentOnLoopingStements;

public class ForLoopEx3 {
	
//WAP to generate Multiplication Table (1 to 10) of 7
	
	public static void main(String args[])
	{
		int mul = 7;
		
		 
		for( int i=1;i<=10;i++)
		{
			int mul1 = mul*i;
			
			System.out.println(mul+"*"+ i+"="+mul1);
		}
		
	}

}
