package package1.abs;

// Note: Constructor of interface can not created
// Only public instance variable can be created in interface
// method can be public abstract, private, default.
// In interface constructor can not be created 
// Because constructor is used to initialize the instance variable 
// But in interface all intance variable is by default 'public static final' 
// there is no need to initialize it and this is the only reason 
// In interface constructor is not allowed.

interface Creatable{
	
	int MIN = 10; // The complete declaration is 'public static final int  a' of 'int a'
	int MAX = 30;
	
	//abstract method
	void meth1(); // The complete declaration is 'public abstract void meth1()' of 'void meth1()'
	
	//static method
	static void printMinValue() {
		
		System.out.println("Min value is: "+MIN);
	}
	
	//privated method
	private void getMaxValue() {
		
		System.out.println("Max value is: "+MAX);
	}
	
	//default method
	default void getValue() {
		
		getMaxValue();
	}	
}

class InterfaceChild implements Creatable{
	
	@Override
	public void meth1() {
		
		System.out.println("This is method inside Creatable interface and overridden in InterfaceChild class");
		
	}
}

public class InterfaceDemo {
	
	public static void main(String[] args) {
		
		InterfaceChild interfaceobject = new InterfaceChild();
		interfaceobject.meth1();
		interfaceobject.getValue();
		Creatable.printMinValue();
	}

}
