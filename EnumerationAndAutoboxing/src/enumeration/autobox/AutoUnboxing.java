package enumeration.autobox;

public class AutoUnboxing {

	public static void main(String[] args) {
		
		//To convert Integer object to its corresponds primitive type
		
		Integer a = 30;
		
		int i = a.intValue(); //converting Integer to int explicitly
		
		int j = a; //autounboxing, compiler will write a.intValue() internally
		
		System.out.println(a+" "+i+" "+j);

	}

}
