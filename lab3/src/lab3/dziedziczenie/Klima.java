package lab3.dziedziczenie;

public class Klima extends Przeglad{
	
	
	protected void dodatkowe (Samochod s) {
		sprKlimy(s);
	}
	
	private void sprKlimy(Samochod s) {
		System.out.println("Sprawdzam klimetyzacje w " + s);
		
	}

	

}
