package minuteur;

public class TicTac extends Thread {
	Minuteur minuteur;

	public TicTac(Minuteur minu) {
		this.minuteur = minu;
	}

	public void run() {
		while (true) {
			 try {
			 Thread.sleep(5000);
			 } catch (InterruptedException e) {
			
			 e.printStackTrace();
			 }
			minuteur.incrSeconde();
			minuteur.incrSeconde();
			minuteur.incrSeconde();
			minuteur.incrSeconde();
			minuteur.incrSeconde();

		}
	}
}
