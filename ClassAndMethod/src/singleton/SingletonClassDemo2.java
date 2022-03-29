package singleton;

//Lazy initialization of singleton class

class Singleton2{
	
	static private Singleton2 singleton = null;
	
	private Singleton2(){
		
		System.out.println("This is lazy initialization of singleton  class.");
	}
	
	static Singleton2 getInstance() {
		
		if(singleton == null)
			singleton = new Singleton2();
		return singleton;
	}
}

public class SingletonClassDemo2 {
	
	public static void main(String[] args) {
		
		Singleton2 ob1 = Singleton2.getInstance();
		System.out.println(ob1.hashCode());
	}

}
