package method.Class.jpac;

class Complex{
	
	int real, img;
	
	int result_real, result_img;
	
	//Constructor to initialize the real, imaginary values
	Complex(int real, int img){
		
		this.real = real;
		this.img = img;
	}
	
	//Method for adding two complex numbers
	String add(Complex c) {
		
		result_real = real + c.real;
		result_img = img + c.img;
		
		return result_real+" + i"+result_img;
	}
	
	//Method for subtracting two complex numbers
	String subtract(Complex c) {
	
		result_real = real - c.real;
		result_img = img - c.img;
		
		return result_real+" + i"+result_img;
	}
	
	//Multiplication of two complex numbers
	String multiply(Complex c) {
		
		result_real = real * c.real - img * c.img;
		result_img = real * c.img + c.real * img;
		
		return result_real+" + i"+result_img;
	}
	
	//Division of two complex numbers
	String divide(Complex c) {
		
		Complex reciprocal_Of_Object_C = new Complex(c.real, -c.img);
		
		String[] numerator = this.multiply(reciprocal_Of_Object_C).split("\\+");
		String[] denominator = c.multiply(reciprocal_Of_Object_C).split("\\+");
		
		double result_r;
		double result_i;
		
		if(Integer.parseInt(denominator[0].trim()) > 0) {
			
			 result_r = Double.parseDouble(numerator[0].trim()) / Double.parseDouble(denominator[0].trim());
			 result_i = Double.parseDouble(numerator[1].trim().substring(1)) / Integer.parseInt(denominator[0].trim());
		}
		else
			return "denominator is zero";
		
		return result_r+" + i"+result_i;
	}
	
	//Method to print the complex number
	void print() {
		
		System.out.println(real+" + i"+img);
	}
	
	
}

//Main class
public class ComplexNumberOperations {
	
	public static void main(String[] args) {
		
		//First complex number
		Complex c1 = new Complex(10, 20);
		c1.print();
		
		//Second Complex number
		Complex c2 = new Complex(20, 40);
		c2.print();
		
		//Adding two complex numbers
		System.out.println("Sum is: "+c1.add(c2));
		
		
		//Subtracting c1 from c2
		System.out.println("Subtration is: "+c2.subtract(c1));
		
		//Multiplication of c1 and c2
		System.out.println("Multiplication is: "+c1.multiply(c2));
		
		//c1 divided by c2
		System.out.println("c1 divided by c2: "+c1.divide(c2));
		
		
	}

}
