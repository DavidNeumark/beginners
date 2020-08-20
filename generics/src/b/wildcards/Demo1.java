package b.wildcards;

import java.util.List;

import types.Citrus;
import types.Fruit;
import types.Orange;

public class Demo1 {

	// methods accepts: a collection of exactly Fruit
	public static void addFruits(List<Fruit> list) {
		// add to the collection: Fruit and down
		list.add(new Fruit());
		list.add(new Citrus());
		list.add(new Orange());
		// element's reference type: Fruit
		Fruit e = list.get(0);
		System.out.println(e);
	}

	// methods accepts: a collection of any type
	public static void printWhatever(List<?> list) {
		// add to the collection: null only
		list.add(null);
		// element's reference type: Object
		for (Object object : list) {
			System.out.println(object);
		}
		Object e = list.get(0);
		System.out.println(e);
	}

	// methods accepts: a collection of Fruit and down
	public static void printFruits(List<? extends Fruit> list) {
		// add to the collection: null only
		list.add(null);
		// element's reference type: Fruit
		for (Fruit fruit : list) {
			System.out.println(fruit);
		}
		Fruit e = list.get(0);
		System.out.println(e);
	}

	// methods accepts: a collection of Fruit and up
	public static void printWhateverAndAddFruits(List<? super Fruit> list) {
		// add to the collection: Fruit and down
		list.add(new Fruit());
		list.add(new Citrus());
		list.add(new Orange());
		// element's reference type: Object
		for (Object obj : list) {
			System.out.println(obj);
		}
		Object e = list.get(0);
		System.out.println(e);
	}

}
