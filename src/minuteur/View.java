package minuteur;

import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JLabel;

public abstract class View implements Observer{

	protected final JButton buttonPlus = new JButton("+");
	protected final JButton buttonMoins = new JButton("-");
	protected final JLabel output = new JLabel();
}
