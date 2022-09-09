package methodHiding;

public class Test {  
	public static void main(String args[])
	{
		Child obj = new Child();
		      obj.m1();                 //child
	    Parent obj1 = new Parent();     
		       obj1.m1();              // Parent
		Parent obj2 = new Child();       
		
		       obj2.m1();              // Child
		
		//	
//	Child obj = new Child();
//	      obj.m1();                    // child
//	Parent obj1 = new Parent();   
//	       obj1.m1();                 // Parent
//	Parent obj2= new Child();
//	       obj2.m1();                 // Parent
//	
	}
	
	
	
	
	
	
	
	
	
}                             
	
	