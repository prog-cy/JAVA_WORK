// Reverse right angle triangle

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		
		int n = sc.nextInt();
		
		System.out.println("Reverse rigth triangle \n");
		
		sc.close();
		
		for(int i = 0; i<n; i++) {
			for(int j = n; j>i; j--) {
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
		
		sc.close();
	}

}
