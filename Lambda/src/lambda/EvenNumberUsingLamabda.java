package lambda;

//Functional interface
interface EvenNumber{
	
	//abstract method 
	boolean isEven(int n);
}

//Main class
public class EvenNumberUsingLamabda {
	
	static int n; //I have defined n here because local variable can not be passed into lambda.
	
	public static void main(String[] args) {
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		
		System.out.println("Enter number: ");
		n = scan.nextInt();
		
		scan.close();
		
		//Lambda expression for verifying even number.
		EvenNumber even = (n)->n%2 == 0;
		
		System.out.println(n+" is even number: "+even.isEven(n));
	}
}
