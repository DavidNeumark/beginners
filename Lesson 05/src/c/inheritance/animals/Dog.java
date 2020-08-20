package c.inheritance.animals;

public class Dog extends Animal {

	@Override
	public void speak() {
		System.out.println("Woof");
	}

	public void bite() {
		System.out.println("bite like a dog");
	}

}
