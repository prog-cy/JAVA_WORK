package inheritance;

// when two or more classes inherits single class it is known as Hierarchical inheritance

class BlackDog extends Animal{
	
	void color() {
		System.out.println("black...");
	}
}

class Cat extends Animal{
	
	void meow() {
		System.out.println("meow...");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		
		Cat c1  = new Cat();
		
		c1.eat();
		c1.meow();
		
		//c1.color() // compile time error
		
		BlackDog d1 = new BlackDog();
		d1.color();
		d1.eat();
		
		//d1.meow() // compile time error
	}

}
