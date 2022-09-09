package interview;

public class Test4 {
	
	public static void main(String args[])
	{
		String s = "My name is Yogesh Biradar";
		String[] words = s.split(" ");
		String reverseString ="";
		
		for(String w: words)
		{
			int l= w.length();
			String reverseWord = "";
			
			for(int i=l-1; i>=0;i--)
			{
				reverseWord = reverseWord+w.charAt(i);
				
				
			}
			reverseString = reverseString+reverseWord+" ";
			
		}
		
		System.out.println(reverseString );
		
		
	}

}
