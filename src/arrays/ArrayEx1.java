package arrays;

public class ArrayEx1 {
	
	
	public static void main(String args [])
	{
		int [] a = new int [3];
		
		
		
		a[0]= 12;
		a[1]= 24;
		a[2]= 36;
	   //a[3]= 48;       ArrayIndexOutOfBoundException
		
		//System.out.println(a[0]);
		
		int len = a.length;
		System.out.println("len of array is "+ len);
		
		for(int i : a)
		{
			
			System.out.println(i);
		}
		
	// other way to represent the array
		
		int [] b = {10, 20, 30, 40, 50};
		
		for (int i : b)
		{
			
			System.out.println(i);
		}
		
		
	}

}
