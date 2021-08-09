// Taking n values and adding them 

public class CommandLine2{

	public static void main(String[] args) {
		double sum = 0;

		for(int i = 0; i<args.length; i++){

			System.out.print(args[i]+" + ");
		}

		for(int i = 0; i<args.length; i++){

			double d = Double.parseDouble(args[i]);

			sum += d;
		}

		System.out.println("\b\b = "+sum);
	}
}