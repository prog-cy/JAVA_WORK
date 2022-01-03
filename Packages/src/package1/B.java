package package1;
import package2.*;


public class B extends C{
	
	public static void main(String[] args) {
		
		B b = new B();
		
		System.out.println(b.protectedMessage);
		
		b.privateMessageDisplay();
	}

}
