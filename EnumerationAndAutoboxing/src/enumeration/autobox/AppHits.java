package enumeration.autobox;

//This is enum for checking how many users are using and  
public enum AppHits {
	
	Facebook(100000, 34), Youtube(200000, 78), Instagram(500000, 34876127);
	
	private int downloads;
	private int hits;
	
	//Constructor to handle the constant values.
	AppHits(int downloads, int hits){
		this.downloads = downloads;
		this.hits = hits;
	}
	
	public int getDownloads() {return downloads;}
	
	public int getHits() {return hits;}
}
