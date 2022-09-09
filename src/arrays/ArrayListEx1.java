package arrays;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		
		
		ArrayList al = new ArrayList();
		
		al.add("suavarna");
		al.add(31);
		al.add(9881808094L);
		al.add('F');
		al.add(null);
		al.add(31);
		al.add(null);
		al.add(168.25);
		
		System.out.println(al);
		
		int size = al.size();
		
		System.out.println(size);
		
        System.out.println(	al.subList(0,4 ));

	
		
		System.out.println(al.get(0));
		System.out.println(al.get(2));
		System.out.println(al.get(3));
		
		System.out.println(al.isEmpty());
		
		System.out.println(al.lastIndexOf(null));
		
		System.out.println(al.remove(4));
		System.out.println(al.remove(null));
		
	    al.set(1, 30);
	    
		System.out.println(al);
		
		System.out.println(al.contains(null));
		
		System.out.println(al.subList(2, 4));
		
		al.clear();
		
		
		
		

	}

}
