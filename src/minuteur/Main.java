package minuteur;

public class Main {
	
	public static void main(String args[])
	{		
		Minuteur minuteur = new Minuteur();
        ViewIncrDecr view = new ViewIncrDecr();
        Controller controller = new Controller(view, minuteur);
	}
}
