public class Guitar extends WoodenObject implements MusicalInstrument {
	
	public void play() {
		System.out.println("La la la da da da la");
	}
	
	public static void main(String[] args) {
		Guitar myGuitar = new Guitar();
		myGuitar.play();
		myGuitar.burn();
	}
}