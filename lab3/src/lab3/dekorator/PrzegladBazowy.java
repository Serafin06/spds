package lab3.dekorator;

public class PrzegladBazowy implements Przeglad {
	private void wymienOlej(Samochod s) {
		System.out.println("Wymieniam olej w " + s);
	}

	private void wymienFiltry(Samochod s) {
		System.out.println("Wymieniam filtry w " + s);
	}

	public void wykonajPrzeglad(Samochod s) {
		
		wymienOlej(s);
		wymienFiltry(s);
		
	}

	
	public void rozpocznijPrzeglad(Samochod s) {
		System.out.println("Zaczynam przegląd samochodu " + s);
		
	}


	public void zakonczPrzeglad(Samochod s) {
		System.out.println("Przegląd samochodu " + s + " zakończony");
		
	}
}
