package lambda;

//Functional interface
interface NumericTest{
	
	//abstract method
	boolean test(int n);
}

public class OperationsUsingLambda {
	
	static int n;
	
	public static void main(String[] args) {
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		
		System.out.println("Enter number: ");
		n = scan.nextInt();
		
		NumericTest odd = (n)-> (n%2) != 0;
		System.out.println(n+" is odd: "+odd.test(n));
		
		
		System.out.println("Enter number: ");
		n = scan.nextInt();
		
		//Block Lambda expression
		NumericTest prime = (n)->{
			
			if(n == 1 || n == 0)
				return false;
			
			for(int i = 2; i*i <= n; i++) {
				
				if(n%i == 0)
					return false;
			}
			return true;
		};
		
		System.out.println(n+" is prime: "+prime.test(n));
		
		
		scan.close();
	}
}
