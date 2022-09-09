package arrays;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		
		hm.put("Firstname", "Suvarna");
		hm.put("Lastname", "Bhamare");
		hm.put("age", 30);
		hm.put("Gender", "Female");
		
		System.out.println(hm);
		
		System.out.println(hm.get("Firstname"));
		
		System.out.println(hm.replace("age", 31));
		
		System.out.println(hm);
		
		System.out.println(hm.size());
		
		System.out.println(hm.keySet());
		
		System.out.println(hm.values());
		
		System.out.println(hm.remove("age"));
		
		System.out.println(hm.putIfAbsent("age", 31));
		System.out.println(hm);

	}

}
