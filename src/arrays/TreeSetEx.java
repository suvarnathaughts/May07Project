package arrays;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		
		ts.add(19);
		ts.add(23);
		ts.add(19);
		
//		ts.add(23.90);
//		ts.add('r');
//		ts.add("Geeta");
		
		System.out.println(ts);
		
		System.out.println(ts.first());
		
		System.out.println(ts.last());
		
		System.out.println(ts.pollFirst());
		
		System.out.println(ts.pollLast());
		
		System.out.println(ts.size());
		
		System.out.println(ts);

	}

}
