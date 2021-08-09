package collection;

import java.util.*;

public class Stack1 {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();
		
		stack.push(12);
		stack.push(13);
		stack.push(14);
		stack.push(15);
		stack.push(16);
		stack.push(17);
		stack.push(18);
		
		for(int x : stack)
			System.out.print(x+" ");
		
		System.out.println("\nPeek: "+stack.peek());
		
		System.out.println("pop: "+stack.pop());
		
		for(int x : stack)
			System.out.print(x+" ");
		
		System.out.println("\nEmpty: "+stack.isEmpty());
		
		System.out.println("size: "+stack.size());
		
		System.out.println("search(): "+stack.search(12));
	}

}
