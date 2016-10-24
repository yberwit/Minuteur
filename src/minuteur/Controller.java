package minuteur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

	View view;
	Minuteur minuteur;
	
	public Controller(View v, Minuteur m)
	{
		view=v;
		minuteur=m;
		minuteur.addObserver(v);
	}
	@Override
	public void actionPerformed(ActionEvent evt) {
		view.buttonPlus.addActionListener(this);
		Object source = evt.getSource();
		if (source == view.buttonMoins)
		{
			minuteur.decrHeure();
		}
		else if(source==view.buttonPlus)
		{
			minuteur.incrHeure();
		}	
	}
	
}
