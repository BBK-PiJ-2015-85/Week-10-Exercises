public class SmartPhone extends MobilePhone {
	
	public void browseWeb(String webPage) {
		System.out.println("Taking you to " + webPage + ".");
	}
	
	public void findPosition() {
		System.out.println("You are at position N40° 44.9064', W073° 59.0735.");
	}
}