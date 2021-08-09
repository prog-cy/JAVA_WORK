// Taking command line argument and then convert these in byte and short

public class CommandLine3{

	public static void main(String[] args) {
		
		byte b = Byte.parseByte(args[0]);

		short s = Short.parseShort(args[1]);

		System.out.println("String in Byte: "+b);

		System.out.println("String in Short: "+s);
	}
}