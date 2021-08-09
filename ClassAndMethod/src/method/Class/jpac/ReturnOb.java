package method.Class.jpac;

class Testd{
	
	int a, b;
	
	Testd(int n1, int n2){
		a = n1;
		b = n2;
	}
	
	Testd add() {
		
		Testd ob = new Testd(2*a , 2*b);
		
		return ob;
	}
}

public class ReturnOb {

	public static void main(String[] args) {
		Testd t1 = new Testd(10, 20);
		
		Testd t2 = t1.add();
		
		System.out.println("t1.a and t1.b: "+t1.a+" "+t1.b);
		System.out.println("t2.a and t2.b: "+t2.a+" "+t2.b);

	}

}
