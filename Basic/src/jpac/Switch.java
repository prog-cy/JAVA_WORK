package jpac;

public class Switch {

	public static void main(String[] args) {
		
		//Testing of switch case
		/*
		 *  syntax
		 *  switch(choice)
		 * {
		 * 	case con:
		 * 			.........
		 * 			break;
		 * 	case con:
		 * 			 .......
		 * 			 break;
		 * 	default:
		 * 			.......
		 * 			break; 
		 *  
		 *  }
		 *  
		 *  choice = integer, char, string but not any floating point number 
		 */
		
		String str = "terminate";
		
		switch(str) {
		
		case "welcome":
			System.out.println("Welcome to switch case");
			break;
		case "terminate":
			System.out.println("program terminated");
			break;
		default:
			System.out.println("Please, enter 'welcome', 'terminate' only");
			break;	
		
		}
		
//		double choice = 2.3;
//		switch(choice) {
//		
//		case 2.3:
//			System.out.println(choice);
//			break;
//		default:
//			System.out.println("Invalid");
//			break;
//		
//		}
	}

}
