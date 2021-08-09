package collection;

import java.util.*;

//old method for creating Map in java.

public class Map1 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		
		//Adding element to the map
		map.put(1, "Rahil");
		map.put(2, "Rupesh");
		map.put(3, "Ratan");
		
		Set<Map.Entry<Integer, String>> set = map.entrySet(); // converting map to set
		
		Iterator<Map.Entry<Integer, String>> it = set.iterator();
		
		while(it.hasNext()) {
			
			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>)it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
		
		

	}

}
