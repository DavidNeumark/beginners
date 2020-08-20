package c;

public class Demo3 {
	public static void main(String[] args) {

		MyRunnable r = new MyRunnable();

		Thread t1 = new Thread(r, "Thread number 1");
		t1.start();
		Thread t2 = new Thread(r, "Thread number 2");
		t2.start();
	}

}
