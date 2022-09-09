package interview;

public class Test2 {
	//count the digits in given number
	public static void main(String args[])
	{  
		int a = 123456;
		int rem;
		int count=0;
		while(a>0)
		{
			 //rem = a%10;  //3  //2  //1
			 //System.out.println(rem);
			 count++;
			 a=a/10;
		}
		
        System.out.println(count);

	}
}