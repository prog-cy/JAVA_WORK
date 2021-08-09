package collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class LinkedHashMap1 {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> lmap = new LinkedHashMap<>();
		
		lmap.put(10, "Rupesh");
		lmap.put(20, "Amit");
		lmap.put(30, "Ritika");
		lmap.put(45, "Vaibhau");
		
		System.out.println("LinkedHashMap: "+lmap.entrySet());
		System.out.println("Key set: "+lmap.keySet());
		System.out.println("Value set: "+lmap.values());
		
		Set<Map.Entry<Integer, String>> set = lmap.entrySet();
		
		Iterator<Map.Entry<Integer, String>> it = set.iterator();
		
		while(it.hasNext()) {
			
			Map.Entry<Integer, String> m = (Map.Entry<Integer, String>)it.next();
			System.out.println(m.getValue());
		}

	}

}
