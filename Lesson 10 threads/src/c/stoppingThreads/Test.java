package c.stoppingThreads;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		MyStoppableThread t1 = new MyStoppableThread();
		t1.start();

		Thread.sleep(4000);

		t1.interrupt();
	}
}
