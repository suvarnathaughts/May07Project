package arrays;

public class EvenAndOddInArray {
	
	public static void main(String args[])
	{
		int[] a= {1,2,3,4,5,6};
		
		for(int b:a)
		{
			if(b%2==0)
			{   System.out.println("Even Numbers:");
				System.out.println(b);
			}
			else
			{   System.out.println("Odd Numbers:");
				System.out.println(b);
			}
		}
		//==================================
		for(int i=0;i<a.length;i++)
		{
			int mod = a[i]%2;
			
			if(mod==0)
			{   System.out.println("Even Numbers:");
				System.out.println(a[i]);
			}
			
			else
			{   System.out.println("Odd Numbers:");
				System.out.println(a[i]);
			}
			
		}
	}

}
