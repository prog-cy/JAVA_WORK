import java.util.*;
import java.io.*;

// I am using HashMap to solve this problem

public class DecimalToRoman {
	
	static int closeValue(Set<Integer> set, int x) {
		
		int m = 1;
		
		for(int n : set) {
			
			while(n<=x) {
				m = Math.max(n, m);
				break;
			}
		}
		
		return m;
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);
		
		System.out.println("Enter number: ");
		
		String in = br.readLine();
		
		int x = Integer.parseInt(in);
		
		int s = x;
		
		String roman = "";
		
		HashMap<Integer, String> m = new HashMap<>();
		
		m.put(1, "I");
		m.put(4, "IV");
		m.put(5, "V");
		m.put(9, "IX");
		m.put(10, "X");
		m.put(40, "XL");
		m.put(50, "L");
		m.put(90, "XC");
		m.put(100, "C");
		m.put(400, "CD");
		m.put(500, "D");
		m.put(900, "CM");
		m.put(1000, "M");
		
		Set<Integer> set = m.keySet();
		
		while(x != 0) {
	
			int v = closeValue(set, x);	
			System.out.println(v);
			String s1 = m.get(v);	
			x = x-v;
			roman += s1;	
		}
		
		System.out.println(s+" in roman "+roman);
		
	}

}
