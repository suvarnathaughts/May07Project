package controlStatements;

public class SwitchEx2 {
	//WAP to make your own calculator
	
	public static void main(String args [])
	{
		int a = 10;
		int b = 20;
		String s = "Multiplication";
		switch(s) 
		{
		case "Addition": System.out.println(a+b);
		break;
		case "Subtraction": System.out.println(a-b);
		break;
		case "Multiplication": System.out.println(a*b);
		break;
		case "Division": System.out.println(a/b);
		break;
		default: System.out.println(s+"  is invalid operation.");
		
		}
	}

}
