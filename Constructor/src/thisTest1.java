//this: to invoke the current class method
class A{
	
	void m() {System.out.println("Inside method m()");}
	
	void n() {
		this.m();
		System.out.println("Inside method n()");
	}
}
public class thisTest1 {

	public static void main(String[] args) {
		
		A a = new A();
		a.n();
	}

}
