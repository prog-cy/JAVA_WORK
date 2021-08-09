package enumeration.autobox;

public class EnumDemo1 {

	public static void main(String[] args) {


		FruitCast fruit = FruitCast.Apple;
		
		System.out.println("Price of "+fruit+" is: "+fruit.getCast());
		
		for(FruitCast fr : FruitCast.values())
			System.out.println(fr+" is "+fr.getCast()+" Rs.");
	}

}
