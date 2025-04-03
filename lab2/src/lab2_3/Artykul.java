package lab2_3;

import java.util.ArrayList;
import java.util.List;

public class Artykul {
	private StringBuffer nazwa;
	private double cena;
	public static int ile = 0;

	private Artykul(String nazwa, double cena) {
		this.nazwa = new StringBuffer(nazwa);
		this.cena = cena;
		ile++;
	}

	private static List<Artykul> pool = new ArrayList<>();

	public static Artykul getInstance(String nazwa, double cena) {

		for (Artykul a : pool) {
			if (a.getNazwa().equals(nazwa) && a.getCena() == cena) {
				return a;
			}
		}

		Artykul nowy = new Artykul(nazwa, cena);
		pool.add(nowy);
		return nowy;

	}

	public String getNazwa() {
		return nazwa.toString();
	}

	public double getCena() {
		return cena;
	}

}