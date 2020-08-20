package c.stoppingThreads;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		MyUnsleepingThread t = new MyUnsleepingThread();
		t.start();
		Thread.sleep(3);
		t.interrupt();
	}
}
