package filehandling;

import java.io.*;

public class BufferedReaderExample2 {

	public static void main(String[] args) throws IOException{
		
		String path =  "C:\\Users\\rupes\\Desktop\\L_Work\\java_work\\Files\\file3.txt";

		Reader fin = new FileReader(path);
		
		BufferedReader br = new BufferedReader(fin);
		
		int i;
		
		while((i = br.read()) != -1)
			System.out.print((char)i);
		
		System.out.println("Done");
		
		br.close();
		
		
		
	}

}
