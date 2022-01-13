package inheritance1;

//Multiple inheritance implemented in java

//Interfaces1
interface Interface1{
	
	void custom_Method1();
	
}

//Interface2
interface Interface2{
	
	void custom_Method2();
}

//Interface3
interface Interface3 extends Interface2{
	
	void custom_Method3();
}

//Normal Parent class
class Parent{
	
	void parentClassMethod() {
		
		System.out.println("I am in ParentClass.");
	}
}

// child class
class Child1 implements Interface1, Interface3{
	
	@Override
	public void custom_Method1() {
		
		System.out.println("This is in Interface 1");
	}

	@Override
	public void custom_Method2() {
		
		System.out.println("This is in Interface 2");
	}

	@Override
	public void custom_Method3() {
		
		System.out.println("This is in Interface 3");
		
	}
}

class Child2 extends Parent implements Interface1, Interface2{

	@Override
	public void custom_Method1() {
		
		System.out.println("This is Interface1 but inside Child2");
		
	}

	@Override
	public void custom_Method2() {
		
		System.out.println("This is Interface2 but inside Child2");
		
	} 
	
}

public class MultipleInheritanceDemo1 {
	
	public static void main(String[] args) {
		
		Child1 ch1 = new Child1();
		Child2 ch2 = new Child2();
		
		ch1.custom_Method1();
		ch1.custom_Method2();
		ch1.custom_Method3();
		
		ch2.parentClassMethod();
		ch2.custom_Method1();
		ch2.custom_Method2();
		
	}

}
