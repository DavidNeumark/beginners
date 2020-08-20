package a;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {

		Map<String, String> dictionary = new TreeMap<>();
		dictionary.put("Table", "A furniture with 4 legs");
		dictionary.put("Dog", "A nice animal");
		dictionary.put("Five", "A number");
		dictionary.put("Java", "A programming language");
		dictionary.put("Five", "The fifth number number"); // update
		System.out.println(dictionary);

		String entry = "Table";
		System.out.println(entry + ": " + dictionary.get(entry));

		Collection<String> keys = dictionary.keySet();
		Collection<String> values = dictionary.values();
		System.out.println(keys);
		System.out.println(values);

		dictionary.remove("Dog");

	}

}
