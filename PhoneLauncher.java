public class PhoneLauncher {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone();
		myPhone.call("123");
		myPhone.call("01582467259");
		myPhone.call("01727896452");
		myPhone.ringAlarm("08:40");
		myPhone.call("07899665425");
		myPhone.playGame("Snake");
		myPhone.call("02564897456");
		myPhone.call("02468987523");
		myPhone.call("07845235641");
		myPhone.call("02065498756");
		myPhone.call("07986552444");
		myPhone.call("02468987523");
		myPhone.printLastNumbers();
		myPhone.browseWeb("bbc.co.uk");
		myPhone.findPosition();
		myPhone.call("999");
		myPhone.printLastNumbers();
	}
}