package assignmentOnOperators;

public class UnaryEx1 
{

	public static void main(String args[])
	{
		int a = 78;                 
		System.out.println(a++);    //78           (78+1=79)
		System.out.println(++a);	//(79+1=80)    80
		System.out.println(a--);	//80           (80-1=79)
		System.out.println(--a);	//(79-1=78)     78
		System.out.println(a++);	//78			(78+1=79)
		System.out.println(++a);	//(79+1=80)     80
		System.out.println(a--);	//80            (80-1=79)
		System.out.println(a++);	//79            (79+1=80)
		System.out.println(--a);	//(80-1=79)      79
		System.out.println(a++);	//79            (79+1=80)
		System.out.println(--a);	//(80-1=79)      79
		System.out.println(a--);	//79            (79-1=78)
		System.out.println(a++);	//78            (78+1=79)
		System.out.println(++a);	//(79+1=80)      80
		System.out.println(a--);	//80            (80-1=79)
		System.out.println(--a);	//(79-1=78)      78
	
		// output in console will be:78 80 80 78 78 80 80 79 79 79 79 79 78 80 80 78
	
	}												
	
}
