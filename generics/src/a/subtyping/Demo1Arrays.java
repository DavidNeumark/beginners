package a.subtyping;

import types.Citrus;
import types.Fruit;
import types.Orange;

public class Demo1Arrays {

	public static void main(String[] args) {

		// this array is exclusive to all types of fruits
		Fruit[] fruits = new Fruit[10];
		fruits[0] = new Fruit();
		fruits[1] = new Citrus();
		fruits[2] = new Orange();

		// this array is exclusive to all types of oranges
		Orange[] oranges = new Orange[10];
		// oranges[0] = new Fruit();
		// oranges[0] = new Citrus();
		oranges[0] = new Orange();
		oranges[1] = new Orange();

		// oddly enough this compiles, sub-typing applies to arrays.
		fruits = oranges;

		// the next line compiles but will throw an ArrayStoreException at runtime
		fruits[0] = new Fruit(); // did we just put a fruit in an array of oranges only?

	}

}
