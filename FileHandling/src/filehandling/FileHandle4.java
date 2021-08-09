package filehandling;

//In this program I am reading a line from a file.

import java.io.FileInputStream;

public class FileHandle4 {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\rupes\\Desktop\\L_Work\\java_work\\Files\\file2.txt";
		
		try {
			
			FileInputStream fin = new FileInputStream(path);
			
			int i = 0;
			
			while((i = fin.read()) != -1) 
				System.out.print((char)i);
			
			fin.close();
			
		}catch(Exception e) {
			
			System.out.println(e);
		}
	}

}
