package jpac;

public class CreateStringUsingByteArray {

	public static void main(String[] args) {
		/*
		 * creating string using byte array
		 * we use constructor String(byte[] byteArray);
		 * we use byte array because most Internet protocol use only 8-bit ascii character
		 */
		
		byte[] byteArray = {65, 66, 67, 68, 69, 70};
		
		String stringOfByteArray = new String(byteArray);
		
		System.out.println("String of byte array: "+stringOfByteArray);
		
		/*
		 *  using constructor String(byte[] byteArray, int startIndex, int charNum);
		 *  we can create string of few byte characters using just above constructor
		 */
		
		String stringOfByteArray1 = new String(byteArray, 1, 4);
		System.out.println(stringOfByteArray1);
	}

}
