// super can be used to invoke parent class method

class Animal1{
	
	void eat() { System.out.println("eating...");}
}

class Dog1 extends Animal1{
	
	void eat() { System.out.println("eating bread...");}
	
	void work() {
		super.eat();
		bark();
	}
	
	void bark() {
		System.out.println("barking...");
	}
}

public class TestSuper1 {

	public static void main(String[] args) {
		Dog1 d = new Dog1();
		d.work();
	}

}
