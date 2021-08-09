package filehandling;

import java.io.*;

public class SequenceInputStream1 {

	public static void main(String[] args) {
		
		String path1 = "C:\\Users\\rupes\\Desktop\\L_Work\\java_work\\Files\\file5.txt";
		String path2 = "C:\\Users\\rupes\\Desktop\\L_Work\\java_work\\Files\\file4.txt";
		

		try {
			
			FileInputStream fin1  = new FileInputStream(path1);
			FileInputStream fin2 = new FileInputStream(path2);
			SequenceInputStream inst = new SequenceInputStream(fin1, fin2);
			
			int i = 0;
			
			while((i = inst.read()) != -1)
				System.out.print((char)i);
			
			fin1.close();
			fin2.close();
			inst.close();
			
			
		}catch(Exception e) {
			
			System.out.println(e.getLocalizedMessage());
		}
	}

}
