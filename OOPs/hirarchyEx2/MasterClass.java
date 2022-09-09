package hirarchyEx2;

public class MasterClass {
	
	public static void main(String args [])
	{
		HDFC obj = new HDFC();
		SBI obj1 = new SBI();
		IDBI obj3 = new IDBI();
		
		obj.rules();
		obj.homeLoan();
		obj1.rules();
		obj1.homeLoan();
		obj3.rules();
		obj3.homeLoan();
		
	}

}
