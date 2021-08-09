package jpac;

public class Immutable {

	public static void main(String[] args) {
		String s = "Rupesh";
		
		s.concat("Dubey");
		
		System.out.println(s);
		
		System.out.println(s.concat(" Dwivedi"));
		
		String s1 = "Pool";
		
		String s2 = "Pool";
		
		String s3 = "Pool";
		
		System.out.println(s1+" "+s2+" "+s3);
		
	}

}
