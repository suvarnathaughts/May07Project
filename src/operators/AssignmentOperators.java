package operators;

public class AssignmentOperators {

//Assignment Operators +=, -=, *=, /=, %=, &=, |=, ^=, <<=, >>=
	
	public static void main(String args[] )
	{   int a= 40;
		
	   
		System.out.println(a+=10);    // 50
		
		System.out.println(a-=10);    //40
		
		System.out.println(a*=20);    //800
		
		System.out.println(a/=5);     //160
		
		System.out.println(a%=5);     //0          160/5= 32
		
		System.out.println(a&=4); // a= a&4 =0,     000        
		                                  //        100	
		                                  //        000
		
		System.out.println(a|=16);  // a=16         // 00000
		                                            // 10000
		                                            // 10000
		
		
		
		System.out.println(a^=8);  // a=24          10000
		                           //               01000
		                           //               11000
		
		System.out.println(a<<=2);   // a = a<<2,   24*2^2= 24*4= 96,   a= 96
		
		System.out.println(a>>=2);    // a = a>>2,  96/2^2= 96/4= 24
	}
	
	
	
}
