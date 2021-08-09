package method.Class.jpac;
// Object class is the super class of all the classes
// It is defined in the java.lang package.

class Demo{
	
	int a = 30;
	
	void meth() {
		System.out.println("The value of a = "+a);
	}
}


public class ObjectClassDemo {
	
	public static void main(String args[]) {
		
		Demo ob = new Demo();
		
		Object obj = "This is string";
		
		System.out.println("\""+obj+"\" "+" belongs to "+obj.getClass()+".");
		
		ob.meth();
		
		System.out.println("hashcode of String object: "+obj.hashCode());
		
		Object obj1 = 34;
		Object obj2 = 45;
		
		System.out.println(obj1+" belongs to"+obj1.getClass());
		System.out.println("hashcode of Integer object: "+obj1.hashCode());
		System.out.println("obj1 to string: "+obj1.toString());
		System.out.println("After converting it to string and performing addition on that value: "+obj1.toString() + obj2.toString());
	}

}
