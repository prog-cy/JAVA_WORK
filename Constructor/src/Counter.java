// Demonstrating the static variable and static method

public class Counter {
	
	static int count = 0; //static variable
	
	
	int cnt = 0;
	
	
	Counter(){
		count++;
		cnt++;
		System.out.println(cnt+"       "+count);
	}
	
	//static method
	static void print() {
		System.out.println(new Counter().cnt+" "); //printing cnt variable in static method with object.
	}

	public static void main(String[] args) {
		
		System.out.println("cnt    count");
		
		Counter ob = new Counter();
		Counter ob1 = new Counter();
		Counter ob2 = new Counter();
		
		print(); //static method is invoked without object
		
		System.out.println(ob.cnt+"\n"+ob1.cnt+"\n"+ob2.cnt);
		System.out.println("Count variable final value: "+count);
		
		
	}

}
