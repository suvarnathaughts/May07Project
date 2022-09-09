package assignmentOnDataTypes;

public class Example3 
{
	public static void main(String args[])
	{
		Example3 obj = new Example3();
		
		obj.m1();
	}
	
	//Short data type : size= 2byte, range= -32768 to 32767

	public void m1() 
	
	{
		short x = 125;
		short y = 250;
	   //short z = (x*y); [it shows error and give suggestion(fix) : add cast to short i.e. (short)]
		short z =(short) (x*y);
		short m =(short) (x-y);
		
		System.out.println(z);
		
		System.out.println(m);
		
	}




}
