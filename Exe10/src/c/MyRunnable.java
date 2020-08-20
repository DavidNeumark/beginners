package c;

import javax.swing.JOptionPane;

public class MyRunnable implements Runnable {

	@Override
	public void run() {

		Thread t = Thread.currentThread();
		JOptionPane.showConfirmDialog(null, "start " + t.getName() + "?");
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " " + t.getName());

			try {
				Thread.sleep(750);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}
