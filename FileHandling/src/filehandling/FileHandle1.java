package filehandling;

import java.io.FileOutputStream;

//In this program I am writing a character to the file.

public class FileHandle1 {

	public static void main(String[] args) {

		String path = "C:\\Users\\rupes\\Desktop\\L_Work\\java_work\\Files\\file1.txt";
		
		try {
			
			FileOutputStream fout = new FileOutputStream(path);
			fout.write(65); //this line will write A in the file.
			fout.write(68);// this line will write D in the file.
			fout.close();
			System.out.println("success...");
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
