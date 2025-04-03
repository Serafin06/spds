package lab3.dekorator;


public class Klima implements Przeglad{
	
	Przeglad p;
	
	Klima (Przeglad p){
		this.p = p;
	}
		
	
	public void rozpocznijPrzeglad(Samochod s) {
	p.rozpocznijPrzeglad(s);
	}
	
	public void wykonajPrzeglad(Samochod s) {
		p.wykonajPrzeglad(s);		
		sprKlimy(s);
	}
	
	private void sprKlimy(Samochod s) {
		System.out.println("Sprawdzam klimetyzacje w " + s);
		
	}
	
	public void zakonczPrzeglad(Samochod s) {
		p.zakonczPrzeglad(s);
	}


}
