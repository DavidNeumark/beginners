package b;

public class TestPerson {

	public static void main(String[] args) {

		Person[] persons = new Person[5];

		persons[0] = new Person(111, "aaa", 25);
		persons[1] = new Person(222, "bbb", 33);
		persons[2] = new Person(333, "ccc", 66);
		persons[3] = new Person(444, "ddd", 11);
		persons[4] = new Person(555, "eee", 44);

		for (int i = 0; i < persons.length; i++) {
			Person curr = persons[i];
			System.out.println(curr);
		}

	}

}
