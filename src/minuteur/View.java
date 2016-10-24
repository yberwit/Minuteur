package minuteur;

import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class View implements Observer{

	protected JButton buttonPlus;
	protected JButton buttonMoins;
	protected JLabel output;
	protected JFrame frame;
	protected JPanel panel;
}
