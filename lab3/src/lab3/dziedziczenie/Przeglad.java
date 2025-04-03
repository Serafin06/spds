package lab3.dziedziczenie;

public class Przeglad {
	private void wymienOlej(Samochod s) {
		System.out.println("Wymieniam olej w " + s);
	}

	private void wymienFiltry(Samochod s) {
		System.out.println("Wymieniam filtry w " + s);
	}
	
	
	public void wykonajPrzeglad(Samochod s) {
		System.out.println("Zaczynam przegląd samochodu " + s);
		wymienOlej(s);
		wymienFiltry(s);
		dodatkowe(s);		
		System.out.println("Przegląd samochodu " + s + " zakończony");
	}
	
	protected void dodatkowe (Samochod s) {}
}
