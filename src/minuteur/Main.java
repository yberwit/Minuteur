package minuteur;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
	
	public static void main(String args[])
	{		
		Minuteur minuteur = new Minuteur();
        ViewIncrDecr view = new ViewIncrDecr();
        Controller controller = new Controller(view, minuteur);
	}
}
