package a;

import javax.swing.JOptionPane;

public class Starter extends Thread {

	public Starter(String name) {
		super(name);
	}

	@Override
	public void run() {

		int option = JOptionPane.showConfirmDialog(null, "Start " + getName());

		if (!(option == JOptionPane.YES_OPTION)) {
			System.out.println("Bye");
			return;
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(i + " - " + getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
