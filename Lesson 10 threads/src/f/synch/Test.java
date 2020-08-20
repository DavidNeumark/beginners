package f.synch;

public class Test {

	public static void main(String[] args) {

		Object key = new Object();
		Car car1 = new Car();

		CarDriver david = new CarDriver("David", car1, key, 200);
		CarDriver israel = new CarDriver("Israel", car1, key, 30);
		CarDriver ronit = new CarDriver("Ronit", car1, key, 100);
		david.start();
		israel.start();
		ronit.start();
	}
}
