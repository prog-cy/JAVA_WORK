class Complex{
	
	private double re, im;
	
	Complex(double re, double im){
		
		this.re = re;
		this.im = im;
	}
	
	//Copy Constructor
	Complex(Complex c){
		
		re = c.re;
		im = c.im;
	}
	
	@Override
	public String toString() {
		
		return re+" + "+im+"i";
	}
	
	
}

//main class
public class CopyConstructorDemo {
	
	public static void main(String[] args) {
		
		Complex c1 = new Complex(10, 30);
		
		Complex c2 = new Complex(c1);
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
