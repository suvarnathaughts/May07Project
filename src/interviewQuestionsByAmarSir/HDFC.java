package interviewQuestionsByAmarSir;
//Can we write multiple classes in a single class

//class 1
class RBI{
    
	public void rules()
	{
		System.out.println("Regulation method");
	}
}
// class 2
class  Bank extends RBI{
	
	public void loan()
	{
		System.out.println("loan method");
	}

}
// class 3
public class HDFC extends Bank
{
	public void homeLoan()
	{
		System.out.println("home loan method");
	}
	public static void main(String args [])
	{
		HDFC obj = new HDFC();
		     obj.rules();
		     obj.loan();
		     obj.homeLoan();
		
	}


}
