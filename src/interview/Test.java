package interview;

public class Test {
	
	public static void main(String args[])
	{
		String s = "My name is Suvarna Bhamare";
		String[] words = s.split(" ");   // ["My", "name", "is", "suavrna"]
		//int len = words.length;
		String reverseString = "";
		
		for(String w: words)
		{   int l= w.length();
			String reverseword ="";
			
			for(int i=l-1;i>=0;i--)
			{
				reverseword = reverseword+w.charAt(i);
				
			}
			reverseString = reverseString+reverseword+" ";
		}
		
		System.out.println(reverseString);
	
	}
	
	
	

}
