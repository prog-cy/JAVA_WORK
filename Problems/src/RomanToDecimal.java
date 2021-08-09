import java.util.*;
import java.io.*;

public class RomanToDecimal {

	public static void main(String[] args) throws IOException {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);
		
		System.out.println("Enter Roman Number");
		
		String roman = br.readLine();
	
		HashMap<Character, Integer> m = new HashMap<>();
		
		m.put('I', 1);
		m.put('V', 5);
		m.put('X', 10);
		m.put('L', 50);
		m.put('C', 100);
		m.put('D', 500);
		m.put('M', 1000);
		
		int decimal = 0;

		int len = roman.length();
		
		for(int i = 0; i<len; i++) {
			if(i!=len-1 && m.get(roman.charAt(i))<m.get(roman.charAt(i+1))) {
				
				decimal += (m.get(roman.charAt(i+1))-m.get(roman.charAt(i)));
				i++;
			}
			
			else
				decimal += m.get(roman.charAt(i));
		
		}
		
		System.out.println(roman+" in decimal "+decimal);

	}

}
