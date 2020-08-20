package a;

public class MyThread extends Thread {

	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println("this is my thread");
		System.out.println(getState());
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " - " + getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
