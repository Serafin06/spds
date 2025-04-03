package lab3.dziedziczenie;

public class Klient {
	public static void main(String[] args) {
		Samochod s = new Samochod("Fiat Punto");
		Przeglad przeglad = new Przeglad();
		przeglad.wykonajPrzeglad(s);
		System.out.println();

		s = new Samochod("Ford Mondeo");
		przeglad.wykonajPrzeglad(s);
		
		System.out.println();
		
		Klima k = new Klima();
		
		k.wykonajPrzeglad(s);
		
		System.out.println();
		
		Swiece sw = new Swiece();
		
		sw.wykonajPrzeglad(s);
	}
}