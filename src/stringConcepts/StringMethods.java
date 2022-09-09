package stringConcepts;

public class StringMethods {
	
	
	public static void main(String args[])
	{
		String s1 = "Suvarna";
		String s2 = "Suvarna";
		String s3 = "    suvarna bhamare   ";
		
	System.out.println	(s1.contains("ar"));
	System.out.println	(s1.contentEquals(s2));
	System.out.println	(s1.endsWith("na"));
	System.out.println	(s1.equals(s2));
	System.out.println	(s1.contains("ar"));
	System.out.println	(s1.equalsIgnoreCase(s3));
	System.out.println	(s1.contains("ar"));
	System.out.println(s3.indexOf("bhamare"));
	System.out.println(s3.lastIndexOf('a'));
	System.out.println(s2.replace(s2, s3));
	System.out.println(s3.strip());
	//System.out.println(s3.trim());
	String[] s = s3.split("bhamare");
	String s4 = s.toString();
	System.out.println(s4);
	
	System.out.println(s3.substring(8));

	
	





	
		
	}

}
