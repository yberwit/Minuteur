package minuteur;

import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.swing.plaf.SliderUI;

public class Main {

	public static void main(String args[]) throws InterruptedException {
		@SuppressWarnings("unused")
		Minuteur minuteur = new Minuteur();
		ViewIncrDecr viewh = new ViewIncrDecr();
		ViewIncrDecr viewm = new ViewIncrDecr();
		ViewIncrDecr views = new ViewIncrDecr();
		ViewClassique minsec = new ViewClassique();
		ViewClassique hminsec = new ViewClassique();

		viewh.frame.setTitle("Heures");
		viewh.frame.setLocation(200, 300);
		viewh.output.setText(String.valueOf(LocalDateTime.now().getHour()));
		viewm.frame.setTitle("Minutes");
		viewm.frame.setLocation(450, 300);
		viewm.output.setText(String.valueOf(LocalDateTime.now().getMinute()));
		views.frame.setTitle("Secondes");
		views.frame.setLocation(700, 300);
		views.output.setText(String.valueOf(LocalDateTime.now().getSecond()));
		minsec.frame.setTitle("Min-Sec");
		minsec.frame.setLocation(500, 200);
		minsec.output.setText(String.valueOf(LocalDateTime.now().getMinute() + "-" + LocalDateTime.now().getSecond()));
		hminsec.frame.setTitle("Heure:Min-Sec");
		hminsec.frame.setLocation(250, 450);
		hminsec.output.setText(String.valueOf(LocalDateTime.now().getHour() + ":" + LocalDateTime.now().getMinute()
				+ "-" + LocalDateTime.now().getSecond()));

		@SuppressWarnings("unused")
		ArrayList<View> Views = new ArrayList<View>();
		Views.add(viewh);
		Views.add(viewm);
		Views.add(views);
		Views.add(minsec);
		Views.add(hminsec);
		@SuppressWarnings("unused")
		Controller controller = new Controller(Views, minuteur);
		while(true)
		{
			Thread.sleep(1000);
			minuteur.incrSeconde();
			
		}

	}
}
