package copyConstructor;

public class Student {
	
	 String name ;
	int rollNumber;
	String branch;
	
	Student(String Name,int Rollnumber, String Branch)
	{
		this.name=Name;
		this.rollNumber=Rollnumber;
		this.branch=Branch;
		
	}
	//copy constructor
	Student(Student st)
	{
		name= st.name;
		rollNumber= st.rollNumber;
		branch = st.branch;
	}
	public void display()
	{
		System.out.println(name);
		
		System.out.println(rollNumber);

		System.out.println(branch);

	}
	
	public static void main(String args[])
	{
		Student obj = new Student("Suvarna", 101, "ENTC");
		obj.display();
		Student obj1 = new Student(obj);
		obj1.name="Geeta";
		obj1.rollNumber=102;
		obj1.branch="BPharm";
		obj1.display();
		
		
		
	}
	
	
	

}
