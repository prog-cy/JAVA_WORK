package jpac;

public class PrimitiveDataType {
	
	public static void main(String[] args) {
		/**
		 *  There are only eight primitive data types
		 *  
		 *  Data Types					Wrapper class			Size(in bytes)
		 *  byte						Byte						1
		 *  short						Short						2
		 *  int							Integer						4
		 *  long						Long						8
		 *  float						Float						4
		 *  double 						Double						8
		 *  boolean						Boolean						JVM dependent
		 *  character					Character					2
		 *  
		 */
		
		byte b = 1;
		short s;
		s = 2;
		
		int i = 500;
		
		long l = 45;
		
		boolean bool = true;
		
		float f = 1.2F;
		
		long l2 = 2_000_000_000L;
		
		double d = 1.3;
		
		var v = 1; // We can store different data values in var ones we stored one type of value we can not store other
		var v1 = 1.3;
		var v2 = true;
		
		System.out.println(b+" "+s+" "+i+" "+l+" "+bool+" "+f+" "+l2+" "+d+" "+v+" "+v1+" "+v2);
		
		//Type conversion
		
		//widening
				/*
				 *  widening means store lesser data type variable in greater data type variable
				 */
				
				long l3 = i;
				double dl = l2;
				
			System.out.println(l3+" "+dl);
			
		//Narrowing
			/*
			 * narrowing means store greater data type variable in lesser data type variable
			 */
			
			byte b1= (byte)i;
			
			int i1 = (int)l2;
			
			System.out.println(b1+" "+i1);
			
		//Autoboxing
			/*
			 * autoboxing means to declare a variable of a wrapper class 
			 */
				
		Integer i4 = 45;
		
		Character ch = 200;
		
		//Unboxing
			/*
			 * unboxing means to declare a variable of primitive data type and store the variable of same wrapper class
			 * in that variable
			 */
		
		int i5 = i4;
		
		char ch1 = ch;
		
		System.out.println(i5+" "+ch1);
	}

}
