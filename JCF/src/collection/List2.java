package collection;

import java.util.*;

// converting array to list 

public class List2 {

	public static void main(String[] args) {
		
		String[] arr = {"C", "C++", "Java","Python", "PHP", "Ruby", "HTML"};
		
		List<String> list = new ArrayList<String>();
		
		System.out.println("Array is: "+Arrays.toString(arr));
		
		for(String lang : arr)
			list.add(lang);
		
		System.out.println("List is: "+list);
		
		
	}

}
