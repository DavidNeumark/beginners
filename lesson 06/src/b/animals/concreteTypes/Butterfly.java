package b.animals.concreteTypes;

import b.animals.abstractTypes.Insect;
import b.animals.interfaceTypes.Flyer;

public class Butterfly extends Insect implements Flyer {

	@Override
	public void speak() {
		System.out.println("speak like a butterfly");
	}

	@Override
	public void takeOff() {
		System.out.println("takeOff like a butterfly");
	}

	@Override
	public void fly() {
		System.out.println("fly like a butterfly");
	}

	@Override
	public void land() {
		System.out.println("land like a butterfly");
	}

}
