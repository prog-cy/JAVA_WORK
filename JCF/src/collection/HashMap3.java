package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Student1{
	
	int age;
	String name;
	static String collegeName = "Stanford";
	
	Student1(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name+" "+age+" "+Student1.collegeName;
	}
}
public class HashMap3 {

	public static void main(String[] args) {

		Student1 s1 = new Student1("Rupesh", 21);
		Student1 s2 = new Student1("Rudra", 20);
		Student1 s3 = new Student1("Rahil", 19);
		Student1 s4 = new Student1("Ratan", 22);
		
		Map<Integer, Student1> map = new HashMap<>();
		map.put(1, s1);
		map.put(2, s2);
		map.put(3, s3);
		map.put(4, s4);
		
		Set<Map.Entry<Integer, Student1>> set = map.entrySet();
		
		Iterator<Map.Entry<Integer, Student1>> it = set.iterator();
		
		while(it.hasNext()) {
			
			Map.Entry<Integer, Student1> m = (Map.Entry<Integer, Student1>)it.next();
			System.out.println(m.getKey()+" Details");
			System.out.println("       "+m.getValue());
		}
		
	}

}
