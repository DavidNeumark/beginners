package b.animals.concreteTypes;

import b.animals.abstractTypes.Bird;
import b.animals.interfaceTypes.AdvancedFlyer;

public class Duck extends Bird implements AdvancedFlyer {

	@Override
	public void speak() {
		System.out.println("speak like a duck");

	}

	@Override
	public void takeOff() {
		System.out.println("takeOff like a duck");
	}

	@Override
	public void fly() {
		System.out.println("fly like a duck");
	}

	@Override
	public void land() {
		System.out.println("land like a duck");
	}

	@Override
	public void dive() {
		System.out.println("dive like a duck");
	}

	@Override
	public void navigate() {
		System.out.println("navigate like a duck");
	}
}
