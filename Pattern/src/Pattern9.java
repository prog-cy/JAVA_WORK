import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		
		int n  = sc.nextInt();
		
		System.out.println("Character Pattern");
		
		int c = 65;
		
		for(int i = 0; i<n; i++) {
			
			for(int j = 0; j<=i; j++) {
				
				char ch = (char)(c);
				System.out.print(ch+" ");
				c++;
			}
			
			System.out.println();
		}
		
		sc.close();

	}

}
