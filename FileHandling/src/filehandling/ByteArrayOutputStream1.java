package filehandling;

import java.io.*;

public class ByteArrayOutputStream1 {

	public static void main(String[] args) {
		
		String path1 =  "C:\\Users\\rupes\\Desktop\\L_Work\\java_work\\Files\\file6.txt";
		String path2 =  "C:\\Users\\rupes\\Desktop\\L_Work\\java_work\\Files\\file7.txt";

		try {
			
			FileOutputStream fout1 = new FileOutputStream(path1);
			FileOutputStream fout2 = new FileOutputStream(path2);
			
			ByteArrayOutputStream bout  = new ByteArrayOutputStream();
			
			String line = "This is written in file";
			
			byte[] b = line.getBytes();
			
			bout.write(b);
			bout.writeTo(fout1);
			bout.writeTo(fout2);
			bout.close();
			System.out.println("success...");
			
		}catch(Exception e) {
			
			System.out.println(e.getLocalizedMessage());
		}
	}

}
