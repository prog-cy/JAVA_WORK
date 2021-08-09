package inheritance;

class A {
	
	int x = 20;
	
	A(){
	    System.out.println("I am in class A");
	}
	
	void meth() {
		
		System.out.println("I am in class A method.");
	}
	
}

class B extends A{
	
	int y = 10;
	
	B(){
		//super() is written by compiler as first statement by default if we will not write explicitly
		System.out.println("I am in class B");
	}
	
	void meth() {
		
		System.out.println("I am in class B method.");
	}
}
public class SuperDemo {

	public static void main(String[] args) {
		
		A ob = new B(); //reference of class A and object of class B
		System.out.println("ob.x: "+ob.x);
		ob.meth();
		
		System.out.println();
		A ob1 = new A();
		ob1.meth();
		
		System.out.println();
		B ob2 = new B();
		System.out.println("ob2.y: "+ob2.y);
		ob2.meth();
		
		
	}

}
