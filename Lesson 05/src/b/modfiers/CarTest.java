package b.modfiers;

public class CarTest {

	public static void main(String[] args) {

		System.out.println("cars made: " + Car.getCounter());
		System.out.println("max car speed: " + Car.MAX_SPEED);

		Car c1 = new Car(40, "Green");
		Car c2 = new Car(100, "Yellow");
		Car c3 = new Car(20, "Red");

		c1.setSpeed(50);
		System.out.println("c1 speed: " + c1.getSpeed());

		System.out.println("cars made: " + Car.getCounter());

	}

}
