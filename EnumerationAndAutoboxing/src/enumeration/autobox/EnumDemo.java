package enumeration.autobox;

public class EnumDemo {

	public static void main(String[] args) {
		
		Fruit fruit = Fruit.Apple; //fruit variable is type of enum Fruit
		
		System.out.println("Value of enum type fruit: "+fruit);
		
		for(Fruit f : Fruit.values())
			System.out.println(f);
		
		System.out.println(Fruit.valueOf("Orange"));
	}

}
