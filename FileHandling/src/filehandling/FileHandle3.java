package filehandling;

// In this program I am reading a single character from a file.

import java.io.FileInputStream;

public class FileHandle3 {

	public static void main(String[] args) {

		String path = "C:\\Users\\rupes\\Desktop\\L_Work\\java_work\\Files\\file2.txt";
		
		try {
			
			FileInputStream fin = new FileInputStream(path);
			
			int i = fin.read();
			
			System.out.println((char)i);
			fin.close();
			
		}catch(Exception e) {
			
			System.out.println(e);
		}
	}

}
