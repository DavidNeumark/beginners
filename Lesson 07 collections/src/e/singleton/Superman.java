package e.singleton;

/**
 * A singleton class from which only one instance can be created.
 */
public class Superman {

	private String name;
	private int speed;

	// 1. create the single instance as a private static variable in the class
	private static Superman instance = new Superman();

	// 2. define a private CTOR
	private Superman() {
	}

	// 3. a public static getter method for the single instance
	public static Superman getInstance() {
		return instance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
