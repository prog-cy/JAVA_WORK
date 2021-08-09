import java.io.*;

class Solution{
	
	static boolean found = true;
	
	static boolean palin(String s, int l, int r) {
		
		if(l >= r) return true;
		
		if(s.charAt(l) != s.charAt(r))
			found = false;
		palin(s, l+1, r-1);
		
		return found;
	}
}
public class CheckPalindromeString {

	public static void main(String[] args) throws IOException {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);
		
		System.out.println("Enter a string: ");
		String str = br.readLine();
		
		
		if(Solution.palin(str, 0, str.length()-1))
			System.out.println("Palindrome");
		else
			System.out.print("Not a palindrome");

	}

}
