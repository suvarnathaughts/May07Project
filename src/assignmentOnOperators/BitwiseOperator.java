package assignmentOnOperators;

public class BitwiseOperator {
	
	public static void main(String args[])
	{
		// Bitwise operator AND (&)
		System.out.println((78>67)&(12<=89)&(67>=78));    //t t f = f
		System.out.println((65>90)&(74<89)&(34>=89));     //f t f = f
		System.out.println((67>=67)&(190<=89)&(167>178));  //t f f = f
		
		
		// Bitwise operator OR (|)
		 
		System.out.println((78>67)|(12<=89)|(67>=78));     // t t f = t
		System.out.println((65>90)|(74<89)|(34>=89));      // f t f = t
		System.out.println((67>=67)|(190<=89)|(167>178));  // t f f = t 
		
		//Bitwise operator XOR (^)
		System.out.println((78>67)^(12<=89)^(67>=78));    // t t f = t t= f
		System.out.println((65>90)^(74<89)^(34>=89));     // f t f = f t = t
		System.out.println((67>=67)^(190<=89)^(167>178)); // t f f = t f = t
		
	}

}
