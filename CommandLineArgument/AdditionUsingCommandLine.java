// In this program we will take two command line values and perform addition on that values

public class AdditionUsingCommandLine{
	
	public static void main(String[] args) {
		 
		 int num1 = Integer.parseInt(args[0]);

		 int num2 = Integer.parseInt(args[1]);

		 int sum = num1 + num2;

		 System.out.println(num1+" + "+num2+" = "+sum);
	}
}