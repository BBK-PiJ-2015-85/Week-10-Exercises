public class StringExt extends String {
	public void printEven() {
		for (int i = 0; i < this.length(); i++) {
			if (i % 2 == 0) {
				System.out.println(this.charAt(i));
			}
		}
	}
}