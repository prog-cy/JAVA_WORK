package collection;

import java.util.*;

public class HashMap2 {

	public static void main(String[] args) {
		//In this program we will see different ways to add elements in the HashMap
		HashMap<Character, String> map = new HashMap<Character, String>();
		
		map.put('A', "Apple");
		map.put('B', "Boll");
		map.put('C', "Cat");
		
		System.out.println("Iterating map ");
		
		Set<Map.Entry<Character, String>> set = map.entrySet();
		
		Iterator<Map.Entry<Character, String>> it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry<Character, String> m = (Map.Entry<Character, String>)it.next();
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		map.putIfAbsent('D', "Dog");
		
		System.out.println("Invoking after adding using putIfAbsent() method");
		
		for(Map.Entry<Character, String> m : map.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
		
		Map<Character, String> map1 = new HashMap<>();
		map1.put('G', "Girl");
		
		map.putAll(map1);
		
		System.out.println("Invoking after adding using putAll() method");
		
		for(Map.Entry<Character, String> m : map.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
		
		//removing elements from the HashMap
		
		map.remove('A');
		System.out.println("Updated Map: "+map.entrySet());
		
		map.remove('G', "Girl");
		System.out.println("Updated Map: "+map);
		
		//replacing a (key, value) pair using replace() method
		map.replace('D', "Doll");
		System.out.println("After replacing one pair: "+map);
		
		map.replace('B', "Boll", "Boy");
		System.out.println("After replacing one pair: "+map);
		
		map.replaceAll((K, V)->"None");
		System.out.println("After replacing all pair: "+map);
		

	}

}
