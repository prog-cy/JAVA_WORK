package inheritance;

//In this java program we will demonstrate single inheritance in java
// When a class inherits another class is known as single inheritance

class Single{
	
	void display() {
		System.out.println("I am in Single class");
	}
}
public class SingleInheritance extends Single{
	
	void show() {
		System.out.println("I am in SingleInheritance class");
	}

	public static void main(String[] args) {
		SingleInheritance ob = new SingleInheritance();
		
		ob.display();
		ob.show();

	}

}
