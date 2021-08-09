package generic;

//declaring a generic class having three parameter
class ThreeGen<T1, T2, T3>{
	
	T1 ob1;
	T2 ob2;
	T3 ob3;
	
	ThreeGen(T1 ob1, T2 ob2, T3 ob3){
		this.ob1 = ob1;
		this.ob2 = ob2;
		this.ob3 = ob3;
	}
	
	T1 getob1() {
		return ob1;
	}
	
	T2 getob2() {
		return ob2;
	}
	
	T3 getob3() {
		return ob3;
	}
	
	void showType() {
		System.out.println("Type of T1: "+ob1.getClass().getName());
		System.out.println("Type of T2: "+ob2.getClass().getName());
		System.out.println("Type of T3: "+ob3.getClass().getName());
	}
}


public class GenClassDemo2 {

	public static void main(String[] args) {
		
		//declaring object of ThreeGen class
		ThreeGen<Integer, String, Float> gen1 = new ThreeGen<>(2345, "Gnerics", 34.56f);
		System.out.println("Value: "+gen1.getob1());
		System.out.println("Value: "+gen1.getob2());
		System.out.println("Value: "+gen1.getob3());
		gen1.showType();
		
		ThreeGen<String, String, String> gen2 = new ThreeGen<>("Rupesh", "Ram", "Ratan");
		System.out.println("Value: "+gen2.getob1());
		System.out.println("Value: "+gen2.getob2());
		System.out.println("Value: "+gen2.getob3());
		gen2.showType();


	}

}
