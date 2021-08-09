package jpac;

public class IfElse {

	public static void main(String[] args) {
		
		int n = 20;
		
		if(n == 10)
			System.out.println("You are in if block");
		else if(n != 10)
			System.out.println("You are in else-if block");
		else
			System.out.println("you are in else block");
		
		/**
		 *  if(condition 1) // condition 1 is correct then if block will be executed
		 *  
		 *  else if(condition 2) // condition 1 is false then else - if block will be executed o/w this block will
		 *  not be checked
		 *  
		 *  else
		 *  	if above both condition will be wrong then else block will be executed
		 *
		 */
	}

}
