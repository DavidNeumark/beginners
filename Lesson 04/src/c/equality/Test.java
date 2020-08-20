package c.equality;

import b.Person;

public class Test {

	public static void main(String[] args) {

		String str1 = new String("AAA");
		String str2 = new String("AAA");

		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));

		Person p1 = new Person(111, "aaa", 22);
		Person p2 = new Person(111, "aaa", 22);
		System.out.println(p1.equals(p2));
	}

}
