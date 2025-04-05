package lab4;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class Aukcja extends Observable {
	private double cena;

	public Aukcja(double cena) {
		this.cena = cena;
		setChanged(); 
		notifyObservers(cena);
	}

	public void setCena(double cena) {
		this.cena = cena;
		setChanged(); 
		notifyObservers(cena); 
	}

	public double getCena() {
		return cena;
	}
}
