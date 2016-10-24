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
		view.buttonPlus.addActionListener(this);
		view.buttonMoins.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent evt) {
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
