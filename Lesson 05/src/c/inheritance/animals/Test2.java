package c.inheritance.animals;

public class Test2 {

	public static void main(String[] args) {

		Dog[] dogs = { new Dog(), new Dog(), new Dog() };

		dogs[0].speak();
		dogs[1].speak();
		dogs[2].speak();

		System.out.println("==========");

		for (int i = 0; i < dogs.length; i++) {
			dogs[i].speak();
			dogs[i].bite();
		}
	}

}
