package c.stoppingThreads;

public class MyStoppableThread extends Thread {

	public MyStoppableThread() {
	}

	public MyStoppableThread(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " - " + getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("this thread was interrupted and will terminate");
				return;
			}
		}
	}

}
