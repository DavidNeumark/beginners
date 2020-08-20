package c.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import types.Person;
import types.PersonAgeComparator;
import types.PersonNameComparator;

public class Demo2 {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<>();

		persons.add(new Person(222, "ccc", 11));
		persons.add(new Person(333, "bbb", 33));
		persons.add(new Person(111, "aaa", 22));

		System.out.println(persons);

		// sort by natural order
		Collections.sort(persons);
		System.out.println(persons);

		// sort by age order
		PersonAgeComparator ageComparator = new PersonAgeComparator();
		Collections.sort(persons, ageComparator);
		System.out.println(persons);

		// sort by name order
		Collections.sort(persons, new PersonNameComparator());
		System.out.println(persons);

	}
}
