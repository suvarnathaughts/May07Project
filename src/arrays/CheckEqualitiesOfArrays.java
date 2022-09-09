package arrays;

public class CheckEqualitiesOfArrays {
	
	public static void main(String args [])
	{
		// arrays length should be equal
		
		int[] a= {1,2,3,4,5};
		int[] b= {1,2,3,4,5};
		
		int L1 = a.length;
		int L2 = b.length;
		boolean status = true;
		if(L1==L2)
		{
		   for(int i=0; i<L1;i++) 
		   {
			  if(a[i]!=b[i]) 
			  {
				  status = false;
			  }
		   }
		}
		else
		{   
			status = false;
			
		}
		
		if(status==true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
	}
	

}
