package collection;

import java.util.*;

public class HashMap1 {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(10, "Mangoes");
		map.put(12, "Bananas");
		map.put(5, "Grapes");
		map.put(45, "Pineapple");
		
		for(Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m);
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
