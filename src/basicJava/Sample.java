package basicJava;

public class Sample {
     
    
	public static void main(String[] args) 
	{
		Sample s= new Sample();
		long r=s.m1(10, 10l);
		long j =s.m1(10l, 2);
		System.out.println(r);
		System.out.println(j);
	

	}
	public long m1(int a, long b)
	{
		long l = a+b;
		return l;
		
	}
	public long m1(long b, int a)
	{
		long h = a-b;
		return h;
	}

}
