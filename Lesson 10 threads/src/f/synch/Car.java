package f.synch;

public class Car {

	private int km;

	public void drive(int distance, Object key) {

		String driverName = Thread.currentThread().getName();

		synchronized (key) {

			System.out.print(driverName + " started at " + km + " for a distance of " + distance + "... ");

			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			km += distance;
			System.out.println(driverName + " finished at " + km);
		}
	}
}
