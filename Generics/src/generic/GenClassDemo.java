package generic;

//Declaring a generic class in java

class Gen<T>{
	
	//declaring an object of type T
	T v;
	
	//Pass the constructor a reference to
	//an object of type T
	Gen(T o){
		v = o;
	}
	
	//Return v;
	T getV() {
		return v;
	}
	
	//show type of T
	void showType() {
		System.out.println("Type of T is: "+v.getClass().getName());
	}
	
}

//To achieve above goal without generic
// But there is an issue in Non Generic class when we create an object of Non Generic class
// and try to access any data present in Non Generic class we have to type-cast first
// But with generic class there is no need to do it explicitly
class NonGen{
	
	Object ob; //ob is now of type Object
	
	NonGen(Object ob){
		
		this.ob = ob;
	}
	
	Object getob() {
		return ob;
	}
	
	void showType() {
		System.out.println("Type of ob is: "+ob.getClass().getName());
	}
}

public class GenClassDemo {

	public static void main(String[] args) {
		
		//Creating an object of Gen<T> class
		//T is Integer
		Gen<Integer> ob = new Gen<Integer>(34);
		int v = ob.getV(); //no need to type casting
		System.out.println("Value is Generic: "+v);
		ob.showType();
		
		//creating NonGen object 
		NonGen ob1 = new NonGen(34);
		int v1 = (Integer)ob1.getob(); //type-casting done explicitly
		System.out.println("Value is Non Generic: "+v1);
		ob1.showType();
		
		//T is String
		Gen<String> sobj = new Gen<String>("Generic");
		String s1 = sobj.getV();
		System.out.println("\nValue in Generic: "+s1);
		sobj.showType();
		
		NonGen sobj1 = new NonGen("Non Geenrics");
		String s= (String)sobj1.getob();
		System.out.println("Value in Non Generic: "+s);
		sobj1.showType();
		
		
	}

}
