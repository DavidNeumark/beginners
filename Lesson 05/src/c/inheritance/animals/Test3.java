package c.inheritance.animals;

public class Test3 {

	public static void main(String[] args) {
		Animal[] animals = { new Dog(), new Cow(), new Cat() };

		for (int i = 0; i < animals.length; i++) {
			animals[i].speak();
			if (animals[i] instanceof Dog) {
				Dog d = (Dog) animals[i];
				d.bite();
			}
		}

	}

}
