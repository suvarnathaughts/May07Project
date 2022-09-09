package encapsulationEx;

public class Sample {
	
	private String s;
	
	public void setMethod(String a)
	{
		s=a;
	}
	public String getMethod()
	{
		return s;
		
	}
	public static void main(String args[])
	{
		Sample obj= new Sample();
		obj.setMethod("Shivlila");
		String v=obj.getMethod();
		System.out.println(v);
	}

}
