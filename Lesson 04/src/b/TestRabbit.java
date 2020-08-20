package b;

public class TestRabbit {

	public static void main(String[] args) {
		Rabbit r1 = new Rabbit("Yaniv", 3, "White");
		Rabbit r2 = new Rabbit("Dorit", 2, "Grey");
		r1.hop();
		r2.hop();

		r1.setName("AAA");
		r1.hop();
	}
}
