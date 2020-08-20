package types;

import java.util.Comparator;

/**
 * Define an other order as comparison logic of Person by the age attribute.
 */
public class PersonAgeComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {

		if (p1.getAge() < p2.getAge()) {
			return -1;
		} else if (p1.getAge() > p2.getAge()) {
			return 1;
		} else {
			return 0;
		}

	}

}
