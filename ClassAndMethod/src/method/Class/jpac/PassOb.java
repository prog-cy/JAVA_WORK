package method.Class.jpac;

class Test{
	
	int a, b;
	
	Test(int n1, int n2){
		a = n1;
		b = n2;
	}
	
	//in this method we are passing an object of class Test
	int equalTo(Test o) {
		if(o.a == a && o.b == b)
			return 1;
		else 
			return 2;
	}
}

public class PassOb {

	public static void main(String[] args) {
		
		Test t1 = new Test(100, 22);
		Test t2 = new Test(100, 22);
		Test t3 = new Test(100, 2);
		
		System.out.println("t1.equalTo(t2): "+t1.equalTo(t2));
		System.out.println("t1.equalTo(t3): "+t1.equalTo(t3));
		
	}

}
