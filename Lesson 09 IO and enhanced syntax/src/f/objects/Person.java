package f.objects;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 2L;

	private int id;
	private String name;
	private int age;
	transient private long secretPassword;

	public Person(int id, String name, int age, long secretPassword) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.secretPassword = secretPassword;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", secretPassword=" + secretPassword + "]";
	}

}
