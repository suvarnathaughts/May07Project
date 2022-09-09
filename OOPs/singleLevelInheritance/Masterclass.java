package singleLevelInheritance;

public class Masterclass {
	
	public static void main(String args[])
	{
		HDFCbank obj = new HDFCbank();
		
		obj.account();   // this method of parent class(Bank)
		obj.loan();      // this method of parent class(Bank)
		obj.homeloan();  // this method of child class(HDFCbank)
		obj.carloan();   // this method of child class(HDFCbank)
	}

}
