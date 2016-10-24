package minuteur;

public class Main {
	
	public static void main(String args[])
	{		
		Minuteur minuteur = new Minuteur();
        ViewIncrDecr view = new ViewIncrDecr();
        @SuppressWarnings("unused")
		Controller controller = new Controller(view, minuteur);
        view.frame.setName("Heures");
	}
}
