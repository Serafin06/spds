package lab3;

public class Klient {
	public static void main(String[] args) {
		Samochod s = new Samochod("Fiat Punto");
		Przeglad przeglad = new Przeglad();
		przeglad.wykonajPrzeglad(s);

		s = new Samochod("Ford Mondeo");
		przeglad.wykonajPrzeglad(s);
	}
}