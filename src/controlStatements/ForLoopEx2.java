package controlStatements;

public class ForLoopEx2 {
	
	// WAP to swap two Numbers
	
	public static void main(String args[])
	{
		int a= 45;
		int b= 35;
		System.out.println("Numbers before swaping:"+a+" "+b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("Numbers after Swaping:" +a+" "+b);
		
		
		int p = 89;
		int q = 67;
		
		System.out.println("Numbers before swaping:"+p+" "+q);
		
		p = p*q;
		q = p/q;
		p = p/q;
		
		System.out.println("Numbers after Swaping:" +p+" "+q);
		
		
		int s = 32;
		int t = 89;
		System.out.println("Numbers before swaping:"+s+" "+t);
		
		s = s^t;
		t = s^t;
		s = s^t;
		
		System.out.println("Numbers after swaping:"+s+" "+t);
		 
	
		
		
		
		
	}

}
