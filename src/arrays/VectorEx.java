package arrays;

import java.util.Vector;

public class VectorEx {
	
	public static void main(String args[])
	{
		Vector v = new Vector();
		
		int c = v.capacity();
		
		System.out.println(c);
		
		v.add("hi");
		v.add(10);
		v.add(45.78);
		v.add(null);
		v.add(null);
		v.add(3);
		v.add('A');
		
		System.out.println(v);
		

		System.out.println(v.elementAt(1));
		

		System.out.println(v.firstElement());
		

		System.out.println(v.lastElement());
		

		System.out.println(v.size());
		

		System.out.println(v.subList(0, 2));
		

		System.out.println(v.remove(1));
		

		v.removeElementAt(2);
		

		System.out.println(v);
		
		v.setSize(20);
		
		
		

	
		
		
		

	
		
		
		
	}

}
