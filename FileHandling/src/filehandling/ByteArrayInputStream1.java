package filehandling;

import java.io.*;

public class ByteArrayInputStream1 {

	public static void main(String[] args) throws IOException{

		byte[] b = {32, 33, 34, 35};
		
		ByteArrayInputStream bin = new ByteArrayInputStream(b);
		
		int i = 0;
		
		while((i = bin.read()) != -1)
			System.out.println("Value "+i+" corresponding ascii character "+(char)i);
		

	}

}
