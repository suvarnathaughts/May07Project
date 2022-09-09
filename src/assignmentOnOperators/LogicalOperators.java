package assignmentOnOperators;

public class LogicalOperators {
	
	public static void main(String args[])
	
	{ 
		// Logical AND operator(&&)
		
		System.out.println((45<25)&&(78<23));                  //f f  = f
		System.out.println((45<25)&&(78<=23)&&(65>=45));	   //f f t = f
		System.out.println((78>=67)&&(45<23)&&(12<9));         //t f f = f
		System.out.println((45<=56)&&(100>23)&&(89>=56));      //t t t = t
		
		//Logical OR operator(||)
		
		System.out.println((45<25)||(78<23));                  // f f = f
		System.out.println((12<25)||(78>=23)||(90==90));      //t t t =t
		System.out.println((45<64)||(7<=23)||(56<45));        //t t f = t
		System.out.println((90>=25)||(78<=23)||(67>89));      //t f f = t
		
		// NOT Logical operator(!)
		
		 System.out.println(!((45<25)||(78<23))) ;                 // f f = f = t
		 System.out.println(!((12<25)||(78>=23)||(90==90)));       //t t t = t = f
		 System.out.println(!((45<25)&&(78<=23)&&(65>=45)));       // f f t = f = t
		 System.out.println(!((45<=56)&&(100>23)&&(89>=56)));      // t t t = t = f
		 
}
	

}
