package enumeration.autobox;

class Demo{
	
	int a = 20;
	
	int b = 30;
	
	void meth(int a){
		
		a = a + 100;
	}
	
	Integer i = 30;
	
	void meth1(Integer i){
		
		i = i + 100;
	}
	
	void change(Demo o) {
		
		o.b = o.b + 40;
	}
}


public class WrapperClass1 {
	

	public static void main(String[] args) {
		
		Demo ob = new Demo();
		
		System.out.println("Before change ob.a:  "+ob.a);
		ob.meth(20); //call by value
		System.out.println("After change ob.a: "+ob.a);
		
		Integer i = 50;
		System.out.println("Before change ob.i: "+ob.i);
		ob.meth1(i); // call by wrapper class
		System.out.println("After change ob.i: "+ob.i);
		
		System.out.println("Before change ob.b: "+ob.b);
		ob.change(ob);// call by object
		System.out.println("After change ob.b: "+ob.b);
	}

}
