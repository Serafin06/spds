package lab4;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class Klient implements Observer {
	String name;
	double maxCena;

	public Klient(String name, double maxCena) {
		this.name = name;
		this.maxCena = maxCena;
	}


	@Override
	public void update(Observable o, Object arg) {
		if (arg instanceof Double) {
			double newCena = (Double) arg;
			if (newCena <= maxCena) {
				System.out.println("Klient "+ name + " dostał info, ze cena:"+newCena);
			} else {
				o.deleteObserver(this);
				System.out.println("Klinet " + name + " rozlaczyl sie");
			}
		}
		
	}
}
