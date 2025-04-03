package lab3.dekorator;

public class Klient {
	public static void main(String[] args) {
		Samochod s = new Samochod("Fiat Punto");
		PrzegladBazowy przeglad = new PrzegladBazowy();
		przeglad.wykonajPrzeglad(s);
		System.out.println();

		s = new Samochod("Ford Mondeo");
		przeglad.wykonajPrzeglad(s);
		System.out.println();
		
		Przeglad p = new PrzegladBazowy();
		p = new Klima(p);
		p = new Swiece(p);
		p = new Klima(p);
		p = new Klima(p);
		
		p.rozpocznijPrzeglad(s);
		p.wykonajPrzeglad(s);
		p.zakonczPrzeglad(s);
		
		System.out.println();
		
		Przeglad p1 = new Klima(new Swiece(new PrzegladBazowy()));
		
		p1.rozpocznijPrzeglad(s);
		p1.wykonajPrzeglad(s);
		p1.zakonczPrzeglad(s);
	}
}