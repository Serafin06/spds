package lab3.dziedziczenie;

public class Swiece extends Przeglad{
	
	protected void dodatkowe (Samochod s) {
		wymianaSwiec(s);
		
	}
	
	private void wymianaSwiec (Samochod s) {
		System.out.println("Wymieniam świece w " + s);
	}

	

}
