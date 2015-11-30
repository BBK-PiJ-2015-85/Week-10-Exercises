public class PhoneLauncher {
	public static void main(String[] args) {
		
		Phone oldPhone = new OldPhone("Nokia");
		System.out.println(((OldPhone)oldPhone).getBrand());
		oldPhone.call("999");
		
		MobilePhone mobilePhone = new MobilePhone("Blackberry");
		System.out.println(mobilePhone.getBrand());
		mobilePhone.call("112");
		mobilePhone.playGame("Tetris");
		
		SmartPhone myPhone = new SmartPhone("Sony");
		
		System.out.println(myPhone.getBrand());
		myPhone.call("123");
		myPhone.call("01582467259");
		myPhone.call("01727896452");
		myPhone.ringAlarm("08:40");
		myPhone.call("07899665425");
		myPhone.playGame("Snake");
		myPhone.call("02564897456");
		myPhone.call("00468987523");
		myPhone.call("07845235641");
		myPhone.call("02065498756");
		myPhone.call("00986552444");
		myPhone.call("02468987523");
		myPhone.printLastNumbers();
		myPhone.browseWeb("bbc.co.uk");
		myPhone.findPosition();
		myPhone.call("999");
		myPhone.printLastNumbers();
	}
}