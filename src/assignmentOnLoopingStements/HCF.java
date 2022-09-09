package assignmentOnLoopingStements;

public class HCF {
	
	// WAP to find out HCF of two Numbers
	
	public static void main(String args[]) 
	{
           int HCF=1;
	       int n1=12; //2 3  6        LCM= 2*3*6=36
	       int n2=18; //2 3  6
	       int LCM;
	       
	       for(int i=1;i<=n1;i++)
	       {
	    	   if(n1%i==0&&n2%i==0) //i=1 2 3 4 5 6 7 8 9 10 11 12
	    	   {
	    		   HCF=i;     //6
	    	   }
	    	   
	       }
	       System.out.println("HCF of given no.s is : "+HCF);
	       
	       LCM=(n1*n2)/HCF;
	       
	       System.out.println("LCM of given no.s is : "+LCM);
	       
	  }

}
