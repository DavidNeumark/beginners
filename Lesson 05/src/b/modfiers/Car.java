package b.modfiers;

public class Car {

	// instance variables - belong to an instance
	private int speed;
	private String color;
	//
	private static int counter; // class variable
	public static final int MAX_SPEED = 120; // class constant

	// CTOR 1
	public Car() {
		Car.counter++;
	}

	// CTOR 2
	public Car(int speed, String color) {
		Car.counter++;
		setSpeed(speed);
		this.color = color;
	}

	// instance methods
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed >= 0 && speed <= MAX_SPEED) {
			this.speed = speed;
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	//

	// class method
	public static int getCounter() {
		return counter;
	}

}
