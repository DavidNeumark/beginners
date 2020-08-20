package b.animals.testings;

import b.animals.abstractTypes.Animal;
import b.animals.concreteTypes.Ant;
import b.animals.concreteTypes.Bat;
import b.animals.concreteTypes.Butterfly;
import b.animals.concreteTypes.Dog;
import b.animals.concreteTypes.Duck;
import b.animals.concreteTypes.Ostrich;
import b.animals.interfaceTypes.AdvancedFlyer;
import b.animals.interfaceTypes.Flyer;
import b.animals.interfaceTypes.Navigator;

public class Test01 {

	public static void main(String[] args) {

		// create an array of animals
		Animal[] animals = new Animal[10];

		// populate the array with animals
		animals[0] = new Dog();
		animals[1] = new Bat();
		animals[2] = new Ostrich();
		animals[3] = new Duck();
		animals[4] = new Butterfly();
		animals[5] = new Ant();
		animals[6] = new Ostrich();
		animals[7] = new Dog();
		animals[8] = new Duck();
		animals[9] = new Ant();

		// iterating over the animals and invoke methods
		for (int i = 0; i < animals.length; i++) {
			animals[i].speak();
			if (animals[i] instanceof AdvancedFlyer) {
				AdvancedFlyer f = (AdvancedFlyer) animals[i];
				f.takeOff();
				f.fly();
				f.navigate();
				f.dive();
				f.land();
			} else if (animals[i] instanceof Flyer) {
				Flyer f = (Flyer) animals[i];
				f.takeOff();
				f.fly();
				f.land();
			} else if (animals[i] instanceof Navigator) {
				Navigator f = (Navigator) animals[i];
				f.navigate();
			}

			System.out.println("=================================");
		}
	}

}
