//this(): to invoke current class constructor

class B {
	
	int age;
	
	B(){
		System.out.println("Default constructor");
	}
	
	B(int x){
		this();
		System.out.println("x = "+x);
	}
	
	B(int x, int y){
		this(x);
		System.out.println("y = "+y);
	}
	
	void meth(int age) {
		this.age = age;	
	}
	
	void meth1(String name, int age) {
		this.meth(age);
		System.out.println("My name is "+name+" and I am "+age+" years old.");
	}
}

public class thisTest2 {
	
	public static void main(String[] args) {
		B a = new B(10, 20);
		a.meth1("Rupesh", 20);

	}

}
