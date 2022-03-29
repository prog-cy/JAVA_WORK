package singleton;

//Eager initialization

class Singleton1{
	
	static private Singleton1 singleton;
	
	static {
		singleton = new Singleton1();
	}
	
	private Singleton1() {
		
		System.out.println("Eager initialization has been made in Singleton class.");
	}
	
	static Singleton1 getInstance() {
		
		return singleton;
	}
	
}

public class SingletonClassDemo1 {
	
	public static void main(String[] args) {
		
		Singleton1 obj1 = Singleton1.getInstance();
		System.out.println(obj1.hashCode());
		
	}

}
