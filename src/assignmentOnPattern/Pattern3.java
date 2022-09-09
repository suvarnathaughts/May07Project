package assignmentOnPattern;

public class Pattern3 {/*
	
	*****
	****
	***
	**
	*                    */
 public static void main(String args[])
 {
	 for (int i=1;i<=5;i++)    // for rows
	 {
		 for(int j=5;j>=i;j--)  // for column
		 {
			 System.out.print("*");
		 }
		 System.out.println();
	 }
 }
	
	
}
