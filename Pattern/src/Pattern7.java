import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		
		int n  = sc.nextInt();
		
		System.out.println("Rigth pascal's triangle");
		
		for(int i = 0; i<n; i++) {
			
			for(int j = 0; j<=i; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		for(int i= 0; i<n; i++) {
			for(int j = n; j>i+1; j--)
				System.out.print("*"+" ");
			System.out.println();
		}
		
		sc.close();
	}

}
