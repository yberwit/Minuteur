package minuteur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Controller implements ActionListener {

	ArrayList<View> m_views;
	Minuteur minuteur;

	public Controller(ArrayList<View> views, Minuteur m) {
		m_views = views;
		minuteur = m;

		for (View v : m_views) {
			minuteur.addObserver(v);
			if (v instanceof ViewIncrDecr) {
				v.buttonPlus.addActionListener(this);
				v.buttonMoins.addActionListener(this);
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		Object source = evt.getSource();
		for (View v : m_views) {
			if (source == v.buttonMoins) {
				switch (v.frame.getTitle()) {
				case "Heures":
					minuteur.decrHeure();
					break;
				case "Minutes":

					minuteur.decrMinute();
					break;
				case "Secondes":
					minuteur.decrSeconde();
					break;
				default:
					break;
				}

			} else if (source == v.buttonPlus) {
				switch (v.frame.getTitle()) {
				case "Heures":
					minuteur.incrHeure();
					break;
				case "Minutes":
					minuteur.incrMinute();
					break;
				case "Secondes":
					minuteur.incrSeconde();
					break;

				default:
					break;
				}

			}
		}
	}

}
