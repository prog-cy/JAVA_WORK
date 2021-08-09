package filehandling;

//In this program I am writing code to copy the content of one file into other file.

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class CopyBytes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String source = "C:\\Users\\rupes\\Desktop\\L_Work\\java_work\\Files\\file3.txt";
		String dest = "C:\\Users\\rupes\\Desktop\\L_Work\\java_work\\Files\\file4.txt";
		
		
		try {
			
			 FileOutputStream fout = new FileOutputStream(source);
			 FileInputStream fin = new FileInputStream(source);
			 FileOutputStream fout1 = new FileOutputStream(dest);
			
			 System.out.println("Enter line: ");
			 String str = sc.nextLine();
			
			byte[] b = str.getBytes();
			fout.write(b);
			
			int i = 0;
			
			while((i = fin.read()) != -1) {
				fout1.write(i);
			}
			fout.close();
			fin.close();
			fout1.close();
			
		}catch(Exception e) {
			
			System.out.println(e);
			
			
		}finally {
			sc.close();
		}
	}

}
