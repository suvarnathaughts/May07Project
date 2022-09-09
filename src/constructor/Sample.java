package constructor;

public class Sample {
	
	char b;
	
	Sample()
	{
		b = 'A';
	}
	Sample(char c)
	{
		b = 'H';
	}
	Sample(float g)
	{
		g = 45.7f;
		System.out.println(g);
	}
	
	public void show()
	{
		System.out.println(b);
	}
	public static void main(String args[])
	{
		Sample obj = new Sample();
		Sample obj1 = new Sample('h');
		Sample obj3 = new Sample(10.10f);
		obj.show();
		obj1.show();
		// Sample.show();
	}
}

