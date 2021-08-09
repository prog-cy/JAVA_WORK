public class BoxDemo {

	public static void main(String[] args) {
		
		Box b = new Box(2, 3.3, 4);
		Box b1 = new Box(5.3, 2.3, 5.6);
		Box b2 = new Box(4.67, 7.6, 89);
		
		System.out.printf("Volume of box is: %.2f", b.volume());
		

		System.out.printf("\nVolume of box is: %.2f", b1.volume());
		
		System.out.printf("\nVolume of box is: %.2f", b2.volume());
	}

}
