package assignmentOnLoopingStements;

public class DuplicateCharacters {
	
	// WAP to find out duplicate characters in string
	
	public static void main(String args[]) 
	{
		String s="automation tester";
		int count;
		int len = s.length();
		
		char ch[]=s.toCharArray();
		
		for(int i=0;i<len;i++)
		{
			count=1;
			
			for(int j=i+1;j<len;j++)
			{
				
				if(ch[i]==ch[j]&&ch[i]!=' ')
				{
				    count++;
				    
				    ch[j]='0';
				}
			}
			if(count>1&&ch[i]!='0')
			{
				System.out.println(ch[i]);
				System.out.println(count);
			}
		}
		
		
		
		
		
		
		
	}

}
