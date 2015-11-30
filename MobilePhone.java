public class MobilePhone extends OldPhone {
	private String[] dialledNumbers;
	
	public MobilePhone() {
		dialledNumbers = new String[10];
	}
	
	public void ringAlarm(String alarmTime) {
		System.out.println("IT IS " + alarmTime + "!");
	}
	
	public void playGame(String game) {
		System.out.println("Let's play " + game + "!");
	}
	
	@Override
	public void call(String number) {
		super.call(number);
		for (int i = 9; i >= 1; i--) {
			dialledNumbers[i] = dialledNumbers[i - 1];
		}
		dialledNumbers[0] = number;
	}
	
	public void printLastNumbers() {
		for (int i = 0; i < 10; i++) {
			System.out.println(dialledNumbers[i]);
		}
	}
}