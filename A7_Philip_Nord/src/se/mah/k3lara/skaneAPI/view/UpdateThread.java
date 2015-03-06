package se.mah.k3lara.skaneAPI.view;

public class UpdateThread extends Thread {

	private TimeTabelGUI gui;

	public UpdateThread(TimeTabelGUI g) {
		this.gui = g;
	}

	public void run() {
		while (true) {

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			gui.UpdateLabels();
		}
	}

}
