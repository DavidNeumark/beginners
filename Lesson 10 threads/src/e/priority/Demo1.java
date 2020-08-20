package e.priority;

import c.stoppingThreads.MyUnsleepingThread;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		MyUnsleepingThread t1 = new MyUnsleepingThread("t1");
		MyUnsleepingThread t2 = new MyUnsleepingThread("t2");

		t2.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();

		t1.join();
		t2.join();
		System.out.println("t1 priority: " + t1.getPriority());
		System.out.println("t2 priority: " + t2.getPriority());
	}
}
