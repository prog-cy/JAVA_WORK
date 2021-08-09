package filehandling;

import java.io.*;

public class BuffereReaderExample1 {

	public static void main(String[] args) throws Exception {
		
		//This is used for fast I/O in java.

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);
		
		System.out.println("Enter your name: ");
		String name = br.readLine();
		
		System.out.println("Your name "+name);
		
		

	}

}
