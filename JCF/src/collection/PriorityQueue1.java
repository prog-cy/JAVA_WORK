package collection;

import java.util.*;


public class PriorityQueue1 {

	public static void main(String[] args) {

		PriorityQueue<String> queue = new PriorityQueue<String>();
		
		queue.add("Amit");
		queue.add("Rupesh");
		queue.add("Bipin");
		queue.add("Vinay");
		
		System.out.println("head: "+queue.element());
		System.out.println("head: "+queue.peek());
		
		System.out.println("All queue elements");
		for(String name : queue)
			System.out.println(name);
		
		queue.remove();
		queue.poll();
		
		System.out.println("\n\nAfter removing two element");
		for(String name : queue)
			System.out.println(name);
	}

}
