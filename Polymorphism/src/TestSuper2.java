class A{
	
	A() {System.out.println("I am inside parent class.");}
}

class B extends A{
	
	B(){
		super();
		System.out.println("I am inside child class.");
	}
	
	void meth() { };
}
public class TestSuper2 {

	public static void main(String[] args) {
		B b = new B();
		b.meth();
	}

}
