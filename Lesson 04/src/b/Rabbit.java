package b;

public class Rabbit {

	// fields
	private String name;
	private int age;
	private String color;

	// CTOR 1
	public Rabbit() {
		name = "default";
		age = 1;
		color = "White";
	}

	// CTOR 2
	public Rabbit(String name, int age, String color) {
		this.name = name;
		setAge(age);
		this.color = color;
	}

	// methods
	public void hop() {
		System.out.println(name + " hop");
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
		if (age >= 0 && age <= 20) {
			this.age = age;
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
