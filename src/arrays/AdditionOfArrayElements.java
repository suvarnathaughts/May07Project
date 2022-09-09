package arrays;

public class AdditionOfArrayElements {

	public static void main(String[] args) {
	     
		int[] a = {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum+a[i];
		}
		System.out.println(sum);
		
		
		//============================
		int sum1=0;
		for(int b :a)
		{
			sum1 = sum1+b;
		}
        System.out.println(sum1);
	}

}
