package e.casting;

import b.Person;

public class Demo2 {

	public static void main(String[] args) {
		Person p1 = new Person(111, "aaa", 33);
		Object o1 = p1; // implicit casting

		if (o1 instanceof Person) {
			p1 = (Person) o1; // explicit casting
		}

		// exception - שגיאה בזמן ריצה
		String str = (String) o1;
	}

}
