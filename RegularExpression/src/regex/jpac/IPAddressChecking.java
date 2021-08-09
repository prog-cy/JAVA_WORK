package regex.jpac;
import java.util.regex.*;

import java.io.*;

public class IPAddressChecking {

	public static void main(String args[]) throws IOException{
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);
		
		System.out.println("Enter IP address: ");
		
		String ipaddress = br.readLine();
		
		String p = "([0-9]{1,2}|[0-1][0-9]{2}|2[0-4][0-9]|25[0-5])";
		String pattern = p + "\\." + p + "\\." + p + "\\." + p;
		
		
		
		Pattern p1 = Pattern.compile(pattern);
		Matcher m = p1.matcher(ipaddress);
		boolean b = m.matches();
		
		if(b)
			System.out.println("Your IP Adress is valid.");
		else
			System.out.println("Your IP Adress is not valid.");
		
		
	}

}



