package d.daemon;

import c.stoppingThreads.MyStoppableThread;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		MyStoppableThread t1 = new MyStoppableThread("t1 - application thread");
		MyStoppableThread t2 = new MyStoppableThread("t2 - daemon thread");
		t2.setDaemon(true);

		System.out.println(t1.isDaemon());
		System.out.println(t2.isDaemon());

		t1.start();
		t2.start();

		Thread.sleep(4000);
		t1.interrupt();

	}
}
