// In this java program we will take command line argument and say good morning to all the people

public class GoodMorning{

	public static void main(String[] args) {
		
		for(int i = 0; i<args.length; i++){

			System.out.println("Good morning "+args[i]+" , how are you.");
		}
	}
}