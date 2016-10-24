package minuteur;

import java.util.ArrayList;

public class Main {

	public static void main(String args[]) {
		@SuppressWarnings("unused")
		Minuteur minuteur = new Minuteur();
		ViewIncrDecr viewh = new ViewIncrDecr();
		ViewIncrDecr viewm = new ViewIncrDecr();
		ViewIncrDecr views = new ViewIncrDecr();
		ViewClassique minsec = new ViewClassique();
		ViewClassique hmin = new ViewClassique();

		viewh.frame.setTitle("Heures");
		viewh.frame.setLocation(200, 300);
		viewm.frame.setTitle("Minutes");
		viewm.frame.setLocation(450, 300);
		views.frame.setTitle("Secondes");
		views.frame.setLocation(700, 300);
		minsec.frame.setTitle("Min-Sec");
		minsec.frame.setLocation(500, 200);
		hmin.frame.setTitle("Heure:Min-Sec");
		hmin.frame.setLocation(250, 450);
		@SuppressWarnings("unused")
		ArrayList<View> Views = new ArrayList<View>();
		Views.add(viewh);
		Views.add(viewm);
		Views.add(views);
		Views.add(minsec);
		Views.add(hmin);
		@SuppressWarnings("unused")
		Controller controller = new Controller(Views, minuteur);

	}
}
