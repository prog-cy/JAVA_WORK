package inheritance1;

interface Changable{
	
	void printMessage();
}

interface InterfaceChild extends Changable{

	void printMessage1();
	
}

interface InterfaceChild1 extends Changable{

	public void printMessage2();
		
}

class Child implements InterfaceChild, InterfaceChild1{

	@Override
	public void printMessage() {
		
		System.out.println("This is method of the Changable interface");
		
	}

	@Override
	public void printMessage1() {
		
		System.out.println("This is method of the InterfaceChild interface");
		
	}

	@Override
	public void printMessage2() {
		
		System.out.println("This is method of the InterfaceChild1 interface");
		
	}
	
}



public class HybridInheritance {
	
	public static void main(String[] args) {
		
		Child ch = new Child();
		ch.printMessage();
		ch.printMessage1();
		ch.printMessage2();
	}

}
