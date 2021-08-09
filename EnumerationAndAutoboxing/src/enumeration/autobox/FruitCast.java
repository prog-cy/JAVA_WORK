package enumeration.autobox;

public enum FruitCast {
	
	Apple(100), Orange(30), Pineapple(300);
	
	private int price;
	
	FruitCast(int p) {price = p;}
	
	int getCast() { return price;}
}
