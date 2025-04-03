package lab3.stategia;

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
		sprKlimy(s);
		wymSwiec(s);

		System.out.println("Przegląd samochodu " + s + " zakończony");
	}

	Klima klima;

	private void sprKlimy(Samochod s) {
		if (klima != null)
			klima.sprKlimy(s);
	}
	
	Swiece swiece;
	
	private void wymSwiec(Samochod s) {
		if (swiece != null)
			swiece.wymSwiec(s);
		
	}
}
