package method.Class.jpac;

public class Human {
	
	String name;
	int age;
	double weight;
	
	Human(String name, int age, double weight){
		
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	void eat() {
		
		System.out.println(name+" eats.");
	}
	
	void drink() {
		System.out.println(name+" drinks water");
	}

}
