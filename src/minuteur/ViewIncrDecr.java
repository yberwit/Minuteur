package minuteur;

import java.awt.Dimension;
import java.util.Observable;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ViewIncrDecr extends View{
	
	public ViewIncrDecr()
	{
			buttonPlus = new JButton("+");
			buttonMoins = new JButton("-");
			output = new JLabel();
			frame = new JFrame();
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        panel = new JPanel();
	        panel.setLayout(null);
	        panel.setPreferredSize(new Dimension(240, 100));

	        frame.setContentPane(panel);

	        output.setSize(100, 30);
	        output.setLocation(10, 10);
	        output.setText(String.valueOf(0));
	        panel.add(output);
	        
	        buttonPlus.setSize(100, 30);
	        buttonPlus.setLocation(120, 60);
	        panel.add(buttonPlus);

	        buttonMoins.setSize(100, 30);
	        buttonMoins.setLocation(10, 60);
	        panel.add(buttonMoins);
	        
	        frame.pack();
	        frame.setVisible(true);
	}
	@Override
	public void update(Observable o, Object arg) {
		output.setText(String.valueOf(((Minuteur) o).getDataHeure()));
		
	}

}
