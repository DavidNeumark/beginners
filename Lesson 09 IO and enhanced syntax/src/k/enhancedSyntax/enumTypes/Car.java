package k.enhancedSyntax.enumTypes;

public class Car {

	private int speed;
	private CarColor color;

	public Car(int speed, CarColor color) {
		super();
		this.speed = speed;
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public CarColor getColor() {
		return color;
	}

	public void setColor(CarColor color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [speed=" + speed + ", color=" + color + "]";
	}

}
