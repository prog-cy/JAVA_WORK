package collection;

import java.util.*;

class Student{
	
	String name;
	int age;
	
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name+" "+age;
	}
}

public class ArrayList4 {

	public static void main(String[] args) {
		
		Student[] a = new Student[3]; //Creating array of object
		a[0] = new Student("Ram", 12);
		a[1] = new Student("Rahul", 15);
		a[2] = new Student("Raman", 16);
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		for(int i= 0; i<a.length; i++)
			list.add(a[i]);
		
		System.out.println(list);

	}

}
