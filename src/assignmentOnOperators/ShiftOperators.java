package assignmentOnOperators;

public class ShiftOperators 
{
	public static void main(String args[])
	
	{
		// shift left operator(<<)
		System.out.println("Shift left operator output:");
		System.out.println(10<<2);      // 10*2^2= 10*4=40
		System.out.println(200<<8);	   	// 200*2^8= 200*256=51200
		System.out.println(30<<6);		//  30*2^6 = 30*64=1920
		System.out.println(40<<3);      //  40*2^3= 40*8= 320
		
		// shift right operator(>>)
		System.out.println("Shift right operator output:");
		System.out.println(60>>2);		//60/2^2=60/4=15
		System.out.println(45>>3);		//45/2^3=45/8=5
		System.out.println(78>>4);		//78/2^4=78/16=4
		System.out.println(30>>5);		//30/2^5=30/32=0
		
	
	}

}
