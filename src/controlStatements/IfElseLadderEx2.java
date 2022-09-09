package controlStatements;

public class IfElseLadderEx2 {
	// WAP to find out smallest number among three numbers(34,31,32)
	public static void main(String []args) {
		
		int a = 34;
		int b = 32;
		int c = 31;
		
		if((a<b)&&(a<c))
		{
			System.out.println(a+" is the smallest among three");
		}
		else if((b<a)&&(b<c))
		{
			System.out.println(b+" is the smallest among three");
		}
		else
		{
			System.out.println(c+" is the smallest among three");
		}
		
	}
}
