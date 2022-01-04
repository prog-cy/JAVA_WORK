package filehandling;

import java.io.File;

public class File1 {

	public static void main(String[] args) {
		
		File file = new File("C:/Users/rupes/Desktop/L_Work/java_work/Files/file1.txt");
		
		if(file.exists()) {
			
			System.out.println("File exits");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
		}
		else {
			
			System.out.println("File does not exits");
		}

	}

}
