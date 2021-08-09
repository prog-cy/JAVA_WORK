package inheritance;

//Demonstration of inheritance in java 
class ParentClass{
	
	int age = 20;
	
	String name = "Rupesh";
	
	void display() {
		System.out.println("My name is "+name+" and I am "+age+" years old.");
	}
	
}

public class InheritanceDemo extends ParentClass {
	
	int num = 21;
	
	void show() {
		System.out.println("Number: " + num);
	}
	

	public static void main(String[] args) {
		InheritanceDemo ob = new InheritanceDemo();
		ob.show();
		ob.display();

	}

}
