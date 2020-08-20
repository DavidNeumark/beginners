package c.stoppingThreads;

public class MyUnsleepingThread extends Thread {

	public MyUnsleepingThread() {
		// TODO Auto-generated constructor stub
	}

	public MyUnsleepingThread(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		System.out.println("interruped status: " + isInterrupted());
		for (int i = 0; i < 100000; i++) {
			if (isInterrupted()) {
				System.out.println("this thread was interrupted and will terminate");
				System.out.println("interruped status: " + isInterrupted());
				return;
			}
			// if (interrupted()) {
			//
			// }
			double x = Math.pow(Math.pow(i, i + 1000), 2);
			System.out.println(i + " - " + getName());
			for (int j = 0; j < 100; j++) {
				double y = Math.pow(Math.pow(i, i + 1000), 2);
			}
		}
		System.out.println("=== terminated" + " - " + getName());
	}

}
