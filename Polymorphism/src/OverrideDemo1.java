class Parent{
	
	void print() {System.out.println("This is parent class.");}
}

class subclass1 extends Parent{
	
	@Override
	void print() {System.out.println("This is subclass 1.");}
}

class subclass2 extends Parent{
	
	@Override
	void print() {System.out.println("This is subclass 2.");}
}

public class OverrideDemo1 {

	public static void main(String[] args) {
		
		//This is one way to do this task
		Parent[] p = {new Parent(), new subclass1(), new subclass2()};
		p[0].print();
		p[1].print();
		p[2].print();
		
		//This is another way to do above task
		Parent a;
		
		a = new subclass1();
		a.print();
		System.out.println("This is the address of subclass1: "+a);
		
		a = new subclass2();
		a.print();
		
		System.out.println("This is the address of subclass2: "+a);
		
		//This is one more way to do above task
		Object[] ob = {new Parent(), new subclass1(), new subclass2()};
		
		((Parent)ob[0]).print();
		((Parent)ob[1]).print();
		((Parent)ob[2]).print();
		
		for(Object x : ob) {
			System.out.println(x);
		}

	}

}
