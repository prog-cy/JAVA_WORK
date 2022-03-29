package method.Class.jpac;

//In java Singleton class is such class whose only one object can be created
class Singleton{
	
	static Singleton singleton = new Singleton();
	
	private Singleton() {
		
		System.out.println("Singlton class is Created. ");
	}
	
	static Singleton  getInstance() {
		
		return singleton;
	}
}

public class SingletonClassDemo {
	
	public static void main(String[] args) {
		
		Singleton ob1 = Singleton.getInstance();
		Singleton ob2 = Singleton.getInstance();
		Singleton ob3 = Singleton.getInstance();
		
		System.out.println(ob1.hashCode());
		System.out.println(ob2.hashCode());
		System.out.println(ob3.hashCode());
	}

}
