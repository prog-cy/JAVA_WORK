interface printable{
	
	int num = 20;
	
	default void show() {
		System.out.println("Number: "+num);
	}
	
	static void display() {
		System.out.println("In interface we can have static method");
	}
	
	void print();
}
public class A6 implements printable{
	
	public void print() {System.out.println("Hello");}
	
	public static void main(String[] args) {
		
		A6 obj = new A6();
		
		obj.print();
		obj.show();
		printable.display();
		
	}

}
