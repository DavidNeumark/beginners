package a;

public class Demo1 {

	public static void main(String[] args) {

		// get a reference to the thread instance
		Thread t = Thread.currentThread();
		System.out.println(t.getName());

		for (int i = 0; i < 10; i++) {
			System.out.println(i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}
