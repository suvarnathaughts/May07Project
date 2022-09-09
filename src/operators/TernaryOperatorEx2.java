package operators;

public class TernaryOperatorEx2 {
	//WAP to find out largest of three numbers(45,78,23)
	
	
	public static void main(String args[]) 
	{
		//first we check largest between 45 and 78
		int a= 45;
		int b= 78;
		int c= 23;
		
	    int d=(a>b)?a:b;
	    //System.out.println(d);
	    
	    int largest = (c>d)?c:d;
	    
	    System.out.println(largest);
	}

}
