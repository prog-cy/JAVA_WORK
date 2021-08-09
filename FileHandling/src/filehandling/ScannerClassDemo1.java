package filehandling;

import java.util.Scanner;

public class ScannerClassDemo1 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		String str = "";
		
		System.out.println("Enter n string");
		
		//hasNext() returns true until it will have 
		
		while(sc.hasNext()) {
			
			str = sc.nextLine();
			
			if(str.equals("stop"))
					break;
			
			System.out.println(str);
			
			
		}
		
		sc.close();
	}

}
