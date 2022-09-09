package assignmentOnMethodCalling;
// method calling in same class with different argument
public class Student 
{
	
	public static void studentName(String a)
	{
		System.out.println("Student Name is "+a);
	}
	
	public void studentRollNo(int b)
	{
		System.out.println("Student RollNo is "+b);
	}
	
	public static void main(String args[])
	{
		Student obj = new Student();
		Student.studentName("Suvarna");
		obj.studentRollNo(101);
	}
}
