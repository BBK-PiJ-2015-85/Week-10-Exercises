public class SmartPhone extends MobilePhone {
	
	public void browseWeb(String webPage) {
		System.out.println("Taking you to " + webPage + ".");
	}
	
	public void findPosition() {
		System.out.println("You are at position N40° 44.9064', W073° 59.0735.");
	}
	
	@Override
	public void call(String number) {
		storeDialledNumber(number);
		if (number.charAt(0) == '0' && number.charAt(1) == '0') {
			System.out.println("Calling <" + number + "> through the internet to save you money.");
		} else {
			super.call(number);
		}
	}
}