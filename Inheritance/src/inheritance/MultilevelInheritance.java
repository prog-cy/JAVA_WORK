package inheritance;

// When there is chain of inheritance, it is known as multilevel inheritance.

class Animal{
	
	void eat() {
		System.out.println("eating...");
	}
}

class Dog extends Animal{
	
	void bark() {
		System.out.println("barking...");
	}
}

class BabyDog extends Dog{
	
	void weep() {
		System.out.println("weeping...");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		BabyDog ob = new BabyDog();
		
		ob.eat();
		ob.bark();
		ob.weep();
	}

}
