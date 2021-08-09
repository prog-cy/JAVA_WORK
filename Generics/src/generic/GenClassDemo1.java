package generic;

//declaring a generic class having Two Type parameters
class TwoGen<T, V>{
	
	T ob1;
	V ob2;
	
	TwoGen(T ob1, V ob2){
		this.ob1 = ob1;
		this.ob2 = ob2;
	}
	
	T getob1() {
		return ob1;
	}
	
	V getob2() {
		return ob2;
	}
	
	void showType() {
		System.out.println("Type of T: "+ob1.getClass().getName());
		System.out.println("Type of V: "+ob2.getClass().getName());
	}
}

public class GenClassDemo1 {

	public static void main(String[] args) {
		
		TwoGen<Integer, String> ob = new TwoGen<Integer, String>(34, "Generics");
		System.out.println("First value: "+ob.getob1());
		System.out.println("Second value: "+ob.getob2());
		ob.showType();
		
		TwoGen<Integer, Character> ob2 = new TwoGen<>(45, 'A');
		System.out.println("First value: "+ob2.getob1());
		System.out.println("Second value: "+ob2.getob2());
		ob2.showType();
		
		TwoGen<Float, Double> ob3 = new TwoGen<>(4.5f, 456.789);
		System.out.println("First value: "+ob3.getob1());
		System.out.println("Second value: "+ob3.getob2());
		ob3.showType();

	}

}
