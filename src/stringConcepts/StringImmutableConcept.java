package stringConcepts;

public class StringImmutableConcept {
	
	public static void main(String args[])
	{  // String class
		
		String s = new String ("Suvarna");
		
		s.concat(" Bhamare");
		
		System.out.println(s);
		
	// String Buffer
		
		StringBuffer sb = new StringBuffer("Suvarna");
		
		sb.append(" Bhamare");
		
		System.out.println(sb);
		
	}

}
