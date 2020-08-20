package a.subtyping;

import java.util.ArrayList;
import java.util.List;

import types.Citrus;
import types.Fruit;
import types.Orange;

public class Demo2Collections {

	public static void main(String[] args) {

		// this collection is exclusive to all types of fruits
		List<Fruit> fruits = new ArrayList<>();
		fruits.add(new Fruit());
		fruits.add(new Citrus());
		fruits.add(new Orange());

		// this collection is exclusive to all types of oranges
		List<Orange> oranges = new ArrayList<>();
		// oranges.add(new Fruit());
		// oranges.add(new Citrus());
		oranges.add(new Orange());
		oranges.add(new Orange());

		// this doesn't compile - sub-typing doesn't apply to collections.
		// fruits = oranges;

		// if it would the next line would store a fruit in an oranges only collection.
		fruits.add(new Fruit());

	}

}
