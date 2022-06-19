package advlambda;

//This is a functional interface
interface Function{
	
	MyClass func(int n); //This function will return a reference of type MyClass
}

class MyClass{
	
	private int val;
	
	//Parameterized constructor
	MyClass(int n){val = n;}
	
	//default constructor
	MyClass(){val = 0;}
	
	//getter function
	int getVal() {return val;}
}


public class ConstructorRefDemo {
	
	public static void main(String[] args) {
		
		//Creating reference to MyClass constructor
		//This will refer to parameterized constructor because our abstract method takes an
		// argument and the constructor which is compatible with func() is parameterized constructor
		// when we make a reference using new it will refer to parameterized constructor.
		Function lambda = MyClass::new;
		
		//Creating instance of MyClass using constructor reference
		MyClass obj = lambda.func(100);
		
		System.out.println("val in obj is: "+obj.getVal());
	}
}
