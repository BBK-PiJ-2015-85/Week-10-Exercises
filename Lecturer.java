/**
* A lecturer has both teaching and research responsibilities
*/
public class Lecturer extends Teacher {
	
	public Lecturer(String name) {
		super(name);
	}
	public void doResearch(String topic) {
		System.out.println("Doing research on: " + topic);
	}
	
	public static void main(String[] args) {
		Lecturer sergio = new Lecturer("sergio");
		System.out.println(sergio.getName());
		sergio.teach("Programming in Java");
		sergio.doResearch("coding.");
	}
}
