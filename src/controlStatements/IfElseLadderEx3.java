package controlStatements;

public class IfElseLadderEx3 {
	
	// WAP to calculate Electricity bill  
	
	public static void main(String args[])
	{
		int u = 305;
		
		
		if(u<=100)
		{
			float c = u*2;                       // for up to 100 units charges = 2rs/unit
			System.out.println(c=c+200);          // 200 is the service charge
		}
		else if (u<=200)
		{
			float c = u*2+(u-100)*1.8f;       // for greater than 100 up to 200 charges = 1.8rs/unit
			System.out.println(c=c+200);       // 200 is the service charge
		}
		else
		{
			float c = 100*2+(100*1.8f)+(u-200)*1.5f;  // for greater than 200 charges = 1.5/unit
			System.out.println(c =c+200 );            // 200 is the service charge
		}
	}

}
