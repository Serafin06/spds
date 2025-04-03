package lab3.stategia;

public class Klient {
	public static void main(String[] args) {
		Samochod s = new Samochod("Fiat Punto");
		Przeglad przeglad = new Przeglad();
		przeglad.wykonajPrzeglad(s);
		
		System.out.println();

		s = new Samochod("Ford Mondeo");
		przeglad.wykonajPrzeglad(s);
		
		System.out.println();
		
		przeglad.klima = new KlimaStd();
		przeglad.klima = new KlimaPrem();
		przeglad.wykonajPrzeglad(s);
		
		
	}
}