package f.OOIntro;

public class Zoo {

	public static void main(String[] args) {

		Animal[] animals = { new Dog(), new Cow() };

		Animal a;

		a = animals[0];
		a.speak();

		a = animals[1];
		a.speak();

	}

}
