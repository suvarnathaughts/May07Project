package assignmentOnConsructor;
public class Student 
{	
	String Name;
	int RollNo;
	
	Student(long l)
	{
		Name = "Suvarna";
		RollNo = 101;
	}
	Student(int i)
	{
		Name = "Tejaswini";
		RollNo = 102;
	}
	Student(float j)
	{
		Name = "Yogesh";
		RollNo = 103;
	}
	Student(char k)
	{
		Name = "Vinod";
		RollNo = 104;
	}
	public void studentInfo()
	{	
		System.out.println(" ");
		System.out.println("Student RollNo:"+RollNo);
		System.out.println("Student Name:"+Name);
	}
	public static void main(String args[])
	{
		Student obj = new Student(7845667777L);
		Student obj1 = new Student(178);
		Student obj2 = new Student(34.5f);
		Student obj3 = new Student('d');
		obj.studentInfo();
		obj1.studentInfo();
		obj2.studentInfo();
		obj3.studentInfo();
	}
}


