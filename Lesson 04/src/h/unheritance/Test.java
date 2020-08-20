package h.unheritance;

public class Test {

	public static void main(String[] args) {
		Person p = new Person();
		Employee e = new Employee();
		Student s = new Student();

		p.talk();
		e.talk();
		s.talk();
	}
}
