package enumeration.autobox;

//This will use the enum AppHits application to show the data.

public class ApplicationInstallationDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Total length of the Enum: "+AppHits.values().length);
		
		System.out.println("Values in Enum: ");
		
		for(AppHits application : AppHits.values()) {
			
			System.out.println("Name: "+application+" installed: "+application.getDownloads()
			+" Number of hits per day: "+application.getHits());
		}
		
		
	}

}
