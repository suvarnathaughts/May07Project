package arrays;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		hs.add("lohu");
		hs.add(10);
		hs.add(23.89);
		hs.add(56);
		hs.add(null);
		hs.add(56);
		hs.add(null);
		
		System.out.println(hs);
		
		System.out.println(hs.contains("lohu"));
		
		System.out.println(hs.remove(null));
		
		System.out.println(hs.isEmpty());
		
		System.out.println(hs.size());
		
		hs.clear();





	}

}
