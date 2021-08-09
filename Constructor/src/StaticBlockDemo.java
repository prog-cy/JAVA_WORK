// In this program I am going to demonstrate static block

public class StaticBlockDemo {
	
	static int a;
	
	//Constructor 
	StaticBlockDemo(){
		System.out.println("Contructor");
	}
	
	//static block 
	static {
		System.out.println("Static block initialized");
		a = 10;
	}
	
	static void print() {
		System.out.println("a inside static method = "+a);
	}
	
	void method() {
		System.out.println("a inside normal method = "+a);
	}
	public static void main(String[] args) {
		
		StaticBlockDemo ob = new StaticBlockDemo();
		print();
		ob.method();
		System.out.println("Main method");
		
	}

}
