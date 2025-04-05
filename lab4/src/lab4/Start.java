package lab4;

public class Start {
	public static void main(String[] args) {
		new Start();
	}

	@SuppressWarnings("deprecation")
	public Start() {
		Aukcja aukcja = new Aukcja(10);

		Klient k1 = new Klient("Adam", 40);
		Klient k2 = new Klient("Olek", 30);

		aukcja.addObserver(k1);
		aukcja.addObserver(k2);

		for (int i = 0; i < 200; i += 10) {
			aukcja.setCena(i);
			System.out.println("Cena" + i);
		}

	}
}