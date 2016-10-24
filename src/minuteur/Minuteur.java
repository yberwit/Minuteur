package minuteur;

import java.util.Observable;

public class Minuteur extends Observable {

	private int dataMinute;
	private int dataHeure;
	private int dataSeconde;
	public int MAX_HEURE = 24;
	public int MAX_MINSEC = 60;

	public Minuteur() {
		this.dataMinute = 0;
		this.dataHeure = 0;
		this.dataSeconde = 0;
	}

	public int getDataMinute() {
		return dataMinute;
	}

	public void setDataMinute(int dataMinute) {
		this.dataMinute = dataMinute;
	}

	public int getDataHeure() {
		return dataHeure;
	}

	public void setDataHeure(int dataHeure) {
		this.dataHeure = dataHeure;
	}

	public int getDataSeconde() {
		return dataSeconde;
	}

	public void setDataSeconde(int dataSeconde) {
		this.dataSeconde = dataSeconde;
	}

	public void incrHeure() {

		dataHeure = (dataHeure + 1) % MAX_HEURE;
		this.setChanged();
		this.notifyObservers();
	}

	public void incrMinute() {

		dataMinute = (dataMinute + 1) % MAX_MINSEC;
		this.setChanged();
		this.notifyObservers();
	}

	public void incrSeconde() {

		dataSeconde = (dataSeconde + 1) % MAX_MINSEC;
		this.setChanged();
		this.notifyObservers();
	}

	public void decrHeure() {
		if (dataHeure != 0) {
			dataHeure--;
		}
		this.setChanged();
		this.notifyObservers();
	}

	public void decrMinute() {
		if (dataMinute != 0) {
			dataMinute--;
		}
		this.setChanged();
		this.notifyObservers();
	}

	public void decrSeconde() {
		if (dataSeconde != 0) {
			dataSeconde--;
		}
		this.setChanged();
		this.notifyObservers();
	}
}
