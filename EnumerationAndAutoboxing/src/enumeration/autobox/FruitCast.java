package enumeration.autobox;

public enum FruitCast {
	
	//values
	Apple(100), Orange(30), Pineapple(300);
	
	private int price;
	
	//constructor
	FruitCast(int p) {price = p;}
	
	//getter method
	int getCast() { return price;}
}
