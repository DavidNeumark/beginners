package f.synch;

public class CarDriver extends Thread {

	private Car car;
	private Object key;
	private int distance;

	public CarDriver(String name, Car car, Object key, int distance) {
		super(name);
		this.car = car;
		this.distance = distance;
		this.key = key;
	}

	@Override
	public void run() {
		car.drive(distance, key);
	}

}
