package package2;

public class C{
	
	String defaultMessage = "This is default message."; //It is default access modifier it is only accessed within this package
	
	public String publicMessage = "This is public message."; //This is visible everywhere
	
	protected String protectedMessage = "This is protected message."; //This is visible to the sub-class of this class
	
	private String privateMessage = "This is private message."; //This is visible only to this class 
	

	protected void privateMessageDisplay() {
		
		System.out.println(privateMessage);
	}

}
