// right angle triangle star pattern
import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		
		int n  = sc.nextInt();
		
		System.out.println("Rigth triangle star pattern");
		
		for(int i = 0; i<n; i++) {
			
			for(int j = 0; j<=i; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		sc.close();
	}

}
