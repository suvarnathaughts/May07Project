package arrays;

public class ArrayEx2 {
	
	public static void main(String args [])
	{
		int  [][] a = new int [3][2];
		a[0][0]= 12;
		a[0][1]= 23;
       	a[1][0] = 56;
		a[1][1]= 12;
		a[2][0]=35;
		a[2][1] = 45;
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		System.out.println(a[2][0]);
		System.out.println(a[2][1]);

		
		int [][] b = { {12, 13},{12,14}, {13, 67}};
		 
		int len = b.length;
		
		System.out.println(len);
		System.out.println(b[0][0]);
		System.out.println(b[0][1]);
		System.out.println(b[1][0]);
		System.out.println(b[1][1]);
		System.out.println(b[2][0]);
		System.out.println(b[2][1]);
		

	}

}
