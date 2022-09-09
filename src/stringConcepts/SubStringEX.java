package stringConcepts;

public class SubStringEX {
	
	
	public static boolean isSubstring(String main, String sub)
	{
		
		return main.contains(sub);
		
    }
	
	public static boolean isSubString2(String main, String sub)
	{
		
		
		return main.indexOf(sub)!=-1;
	}
	
	public static boolean isSubString3(String main, String sub)
	{
		
		
		return main.matches("(.*)"+sub+"(.*)");
				
	}
	
	
	
	public static void main(String args [])
	{
		String s = "I love my country India ";
		
		System.out.println(isSubstring(s,"india"));    //false
		System.out.println(isSubstring(s,"India"));    //true
		
	

		
	}
	

}
