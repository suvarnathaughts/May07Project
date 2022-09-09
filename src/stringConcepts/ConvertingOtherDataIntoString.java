package stringConcepts;

public class ConvertingOtherDataIntoString {
	
	
	public static void main(String args [])
	{
		String s = "12345";
		
		// i want to convert it into numbers
		
		int a = Integer.valueOf(s);
		
		System.out.println(a+10);    //12355
		
		
		String s1 = "123.08";
		
		float f = Float.valueOf(s1);
		
		System.out.println(f+0.5f);
		
		
       // convert number into string
		
		int c = 123;
		
		String v = Integer.toString(c);
		
		System.out.println(v+10);
		
		
		float f1 = 123.07f;
		
		String x = Float.toString(f1);
		
		System.out.println(x+12);
		
		
		
	}

}
