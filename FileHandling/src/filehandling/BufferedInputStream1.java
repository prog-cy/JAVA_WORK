package filehandling;

import java.io.*;

public class BufferedInputStream1 {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\rupes\\Desktop\\L_Work\\java_work\\Files\\file5.txt";

		try {
			
			FileInputStream fin = new FileInputStream(path);
			BufferedInputStream bin = new BufferedInputStream(fin);
			
			int i = 0;
			
			while((i = bin.read()) != -1) {
				System.out.print((char)i);
			}
			
			bin.close();
			fin.close();
			
		}catch(Exception e) {
			
			System.out.println(e.getLocalizedMessage());
		}
	}

}
