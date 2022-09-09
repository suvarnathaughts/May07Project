package arrays;

import java.util.LinkedList;

public class LinkedListEx1 {
	
	
	public static void main(String args[])
	{
		
		LinkedList ld = new LinkedList();
		
		ld.add("Suvarna");
		ld.add('A');
		ld.add(10);
		ld.add(null);
		ld.add(74.89);
		ld.add(null);
		System.out.println(ld);
		
		ld.addFirst("TCS");
		ld.addLast("INFOSYS");
		System.out.println(ld);
		
		System.out.println(ld.get(0));
		System.out.println(ld.getFirst());
		System.out.println(ld.getLast());
		
		
		System.out.println(ld.indexOf(null));
		
		System.out.println(ld.peek());
		
		System.out.println(ld.peekFirst());
		
		System.out.println(ld.peekLast());
		
		System.out.println(ld.poll());
		
		System.out.println(ld.pollFirst());
		
		System.out.println(ld.pollLast());
		
		System.out.println(ld.pop());
		
		System.out.println(ld);
		
        ld.subList(0, 3);
		ld.set(0,"Java");
		

		System.out.println(ld.peekFirst());
		
		
		System.out.println(ld.remove());
		
		System.out.println(ld.remove(2));
		
		System.out.println(ld.removeFirst());
		
		System.out.println(ld);

		
		System.out.println(ld.removeFirstOccurrence(74.89));
		
		System.out.println(ld.contains(10));
		
		System.out.println(ld.pollFirst());

		//System.out.println(ld.pop());
		

		System.out.println(ld.peekFirst());
		
		
		
		

		
		
	}

}
