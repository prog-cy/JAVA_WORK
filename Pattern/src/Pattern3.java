import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n: ");
		
		int n = sc.nextInt();
		
		sc.close();
		
		System.out.println("Left triangle star pattern");
		
		for(int i = 0; i<n; i++) {
			
			for(int j = 2*(n-i); j>0; j--)
				System.out.print(" ");
			for(int k = 0; k<=i; k++)
				System.out.print("* ");
			System.out.println();
		}

	}

}
