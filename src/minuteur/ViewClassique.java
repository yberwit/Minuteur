package minuteur;

import java.awt.Dimension;
import java.util.Observable;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ViewClassique extends View {
	public ViewClassique() {

		output = new JLabel();
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(300, 50));

		frame.setContentPane(panel);

		output.setSize(100, 30);
		output.setLocation(10, 10);

	
		panel.add(output);

		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void update(Observable o, Object arg) {
		switch (this.frame.getTitle()) {
		case "Heure:Min-Sec":
			output.setText(String.valueOf(((Minuteur) o).getDataHeure() + ":" + ((Minuteur) o).getDataMinute() + "-"
					+ ((Minuteur) o).getDataSeconde()));
			break;
		case "Min-Sec":
			output.setText(String.valueOf(((Minuteur) o).getDataMinute() + "-" + ((Minuteur) o).getDataSeconde()));

			break;

		default:
			break;
		}

	}

}
