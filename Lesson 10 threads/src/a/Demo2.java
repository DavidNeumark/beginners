package a;

public class Demo2 {

	public static void main(String[] args) {
		MyThread t1 = new MyThread("t1");
		t1.start();
		MyThread t2 = new MyThread("t2");
		t2.start();

		for (int i = 0; i < 10; i++) {
			System.out.println(i + " - " + Thread.currentThread().getName());
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
