package interviewQuestionsByAmarSir;
//find the number is between 10 and 20
public class ReturnMethodExample {

	int a;
	int b;
	int num;
	ReturnMethodExample(int a,int b,int num)
	{
	   this.a=a;
	   this.b=b;
	   this.num = num;
	}
	public boolean m1()
	{
		if(num>a&&num<b)
		
		    return true;
		else 
			return false;
	}
	public static void main(String args[])
	{
		ReturnMethodExample obj = new ReturnMethodExample(10,20,14);
		System.out.println(obj.m1());
		System.out.println(10+20+"Yogesh"+10+20);
	}
	
}
