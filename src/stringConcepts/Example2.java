package stringConcepts;

// WAP to convert String to int without using parseInt method

public class Example2 {
	
	public static int stringToNumber(String s)
	{
		int len = s.length();
		int num = 0;
		
		for(int i= 0; i<len; i++)
		{
			num = num*10+((int)s.charAt(i)-48);   //48 is ascii value of 0
			
		}
		return num;
		
	}
	
	
	
	public static void main(String args[])
	{
		String s = "123";
		
		System.out.println(stringToNumber(s)+10);
		
		
	}
	

}
