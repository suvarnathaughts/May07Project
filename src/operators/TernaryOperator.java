package operators;

public class TernaryOperator {
	
	public static void main(String args[])
	{
		int age = 17;
		   String result =(age>=18)?"You are eligible for driving license":"Not eligible for driving license";
		   System.out.println(result);
		   
		int a = 10;
		int b = 20;
		
	    int r	=(a<b)?(a+b):(a-b);
	    System.out.println(r);
	    
	    int a1 = 45;
	    int a2 = 56;
	    int b1 = 67;
	    int b2 = 89;
	    int r1= ((a1<a2)&&(b1<b2))?a1+a2+b1+b2:a1-a2-b1-b2;
	    
	    System.out.println(r1);
		      
		   
	}

}
