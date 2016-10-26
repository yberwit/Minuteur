package minuteur;

import java.time.LocalDateTime;
import java.util.Observable;

public class Minuteur extends Observable {

	private int dataMinute;
	private int dataHeure;
	private int dataSeconde;
	public int MAX_HEURE = 24;
	public int MAX_MINSEC = 60;

	public Minuteur() {
		this.dataHeure = LocalDateTime.now().getHour();
		this.dataMinute = LocalDateTime.now().getMinute();
		this.dataSeconde = LocalDateTime.now().getSecond();
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
		if (dataMinute == 0)
			incrHeure();
		this.setChanged();
		this.notifyObservers();
	}

	public void incrSeconde() {

		dataSeconde = (dataSeconde + 1) % MAX_MINSEC;
		if (dataSeconde == 0)
			incrMinute();
		this.setChanged();
		this.notifyObservers();
	}

	public void decrHeure() {
		if (dataHeure != 0) {
			dataHeure--;
		}
		else
			setDataHeure(23);
		this.setChanged();
		this.notifyObservers();
	}

	public void decrMinute() {
		if (dataMinute != 0) {
			dataMinute--;
		}
		else{
			setDataMinute(59);
			decrHeure();
		}
		this.setChanged();
		this.notifyObservers();
	}

	public void decrSeconde() {
		if (dataSeconde != 0) {
			dataSeconde--;
		}
		else{
			setDataSeconde(59);
			decrMinute();
		}
		this.setChanged();
		this.notifyObservers();
	}
}
