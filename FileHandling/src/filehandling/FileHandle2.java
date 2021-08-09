package filehandling;

//In this program I am writing a string in a file.

import java.io.FileOutputStream;

public class FileHandle2 {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\rupes\\Desktop\\L_Work\\java_work\\Files\\file2.txt";
		
		try {
			
			FileOutputStream fout = new FileOutputStream(path);
			
			String str = "I am handling file in java.";
			
			byte[] b = str.getBytes();
			
			fout.write(b);
			fout.close();
			
			System.out.println("success..");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
