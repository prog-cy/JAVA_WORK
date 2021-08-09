package filehandling;

import java.io.FileOutputStream;
import java.io.BufferedOutputStream;

public class BufferedOutputStreamDemo1 {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\rupes\\Desktop\\L_Work\\java_work\\Files\\file5.txt";
		
		try {
			
			FileOutputStream fout = new FileOutputStream(path);
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			
			byte i = 67;
			
			bout.write(i);
			
			String str = "\nI am writing in file using BufferedOutputStream.";
			
			byte[] b = str.getBytes();
			
			bout.write(b, 0, b.length);
			bout.flush();
			fout.close();
			bout.close();
			
			System.out.println("success...");
			
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
	}

}
