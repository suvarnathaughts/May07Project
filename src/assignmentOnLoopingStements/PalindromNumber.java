package assignmentOnLoopingStements;

public class PalindromNumber {
	
	public static void main(String args[])
	{
		int num = 45654;
		int rev = 0;
		int originalNum = num;
		int mod;
		
		while(num>0)
		{
			mod = num%10;
			rev = rev*10+mod;
			num = num/10;
		}
		
		if(originalNum==rev)
		{
			System.out.println("Given number "+originalNum+" is Palindrom Number");
		}
		else
		{
			System.out.println("Given number "+originalNum+" is not a Palindrom Number");
		}
	}

}
