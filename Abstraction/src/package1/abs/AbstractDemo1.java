package package1.abs;


abstract class Demo1{
	
	//private instance variable
	private String name;
	private int age;
	
	//public instance variable
	public String publicString;
	public int publicInteger;
	public double publicDouble;
	
	//Default instance variable
	String defaultString;
	int defaultInteger;
	double defaultlDouble;
	
	//protected instance variable
	String protectedString;
	int protectedInteger;
	double protectedDouble;
	
	//Constructor of Demo1
	Demo1(String name, int age){
		
		this.name = name;
		this.age = age;
	}
	
	//abstract method
	abstract void abstractMethod();
	
	//static method
	static void staticMethod() {
		
		System.out.println("Static method");
	}
	
	//non static method
	void getInformation() {
		
		System.out.println(name+" is "+age+" years old.");
		
	}
	
	//set public values
	void setPublicInstanceVariable(String str, int n, double d) {
		
		publicString = str;
		publicInteger = n;
		publicDouble = d;
	}
	
	//get public values;
	void getPublicInstanceVariable() {
		
		System.out.println("Public String: "+publicString);
		System.out.println("Public Integer: "+publicInteger);
		System.out.println("Public Double: "+publicDouble);
	}
	
	//set default values;
	void setDefaultInstanceVariable(String str, int n, double d) {
		
		defaultString = str;
		defaultInteger = n;
		defaultlDouble = d;
	}
	
	//get default values;
	void getDefaultInstanceVariable() {
		
		System.out.println("Default String: "+defaultString);
		System.out.println("Default Integer: "+defaultInteger);
		System.out.println("Default Double: "+defaultlDouble);
	}
	
	//set protected values;
	void setProtectedInstanceVariable(String str, int n, double d) {
		
		protectedString = str;
		protectedInteger = n;
		protectedDouble = d;
	}
	
	//get protected values
	void getProtectedInstanceVariable() {
		
		System.out.println("Protected String: "+protectedString);
		System.out.println("Protected Integer: "+protectedInteger);
		System.out.println("Protected Double: "+protectedDouble);
	}
	
	
}

class AbstractClassChild extends Demo1{
	
	AbstractClassChild(String name, int age) {
		
		super(name, age); //this will invoke Demo1 class constructor
	}
	
	@Override
	void abstractMethod() {
		
		System.out.println("Abstract method of abstract Demo1 class implemented in child class");
		
	}
}

public class AbstractDemo1 {
	
	public static void main(String[] args) {
		
		Demo1 ob = new AbstractClassChild("Rupesh Kumar Dwivedi", 20);
		ob.abstractMethod();
		ob.getInformation();
		ob.setPublicInstanceVariable("This is public String", 10, 10.8);
		ob.setDefaultInstanceVariable("This is default String", 20, 20.2);
		ob.setProtectedInstanceVariable("This is protected String", 30, 20.0);
		ob.getPublicInstanceVariable();
		ob.getDefaultInstanceVariable();
		ob.getProtectedInstanceVariable();
		AbstractClassChild.staticMethod();
		Demo1.staticMethod();
		
	}

}
