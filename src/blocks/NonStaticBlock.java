package blocks;
//NonStatic Block
public class NonStaticBlock {
	
	
	{
		
		System.out.println("NonStatic Block");
		
	}
	
	public static void main(String args[])
	{
		NonStaticBlock obj =new NonStaticBlock();
		System.out.println("main method");
	}

}
