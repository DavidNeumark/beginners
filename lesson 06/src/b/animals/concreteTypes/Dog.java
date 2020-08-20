package b.animals.concreteTypes;

import b.animals.abstractTypes.Mammal;
import b.animals.interfaceTypes.Navigator;

public class Dog extends Mammal implements Navigator {

	@Override
	public void speak() {
		System.out.println("speak like a dog");
	}

	@Override
	public void navigate() {
		System.out.println("navigate like a dog");
	}

}
