package assignmentOnLoopingStements;

public class ForLoopEx1 {

//	WAP to find out sum of first 10 natural numbers
	public static void main(String args[])
	{
		int i= 20;
		int j= i-10;
		int sum =0;
		
		for(i=20;i>=j;i--)
		{
			 sum = i+sum;
		}
		System.out.println(sum);
	}
}
			
