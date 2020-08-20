package b.lifecycle;

import a.MyThread;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {

		MyThread t1 = new MyThread("t1");

		System.out.println(t1.getState());

		t1.start();
		// t1.stop(); // stop() is deprecated

		System.out.println(t1.getState());

		Thread.sleep(500); // wait for t1 to fall asleep

		System.out.println(t1.getState());

		t1.join(); // the current thread (main) wait until t1 is terminated

		System.out.println(t1.getState());
	}
}
