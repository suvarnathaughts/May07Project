package arrays;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		// array element should not be duplicate
		// array need not be in sorting order
		//array should have proper range
		
		int[] a= {1,3,4,5,6,7};
		int sum1 = 0;
		for(int i=0; i<a.length;i++)
		{
			sum1 = sum1+a[i];
		}
         System.out.println("Sum of elements in an array: "+sum1);
         
        int sum2=0;
        for(int i=1;i<=7;i++)
        {
        	sum2 = sum2+i;
        }
        System.out.println("Sum of elements in an range: "+sum2);
        
        System.out.println("missing element in an array: "+(sum2-sum1));
	}
	

	
}
