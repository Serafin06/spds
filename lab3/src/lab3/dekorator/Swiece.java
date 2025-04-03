package lab3.dekorator;

public class Swiece implements Przeglad{
	
	Przeglad p;
	
	Swiece (Przeglad p){
		this.p = p;
	}
	
	public void wykonajPrzeglad(Samochod s) {
		p.wykonajPrzeglad(s);		
		wymSwiec(s);
	}
	
	private void wymSwiec(Samochod s) {
		System.out.println("Wymieniam swiece w " + s);
		
	}

	@Override
	public void rozpocznijPrzeglad(Samochod s) {
		p.rozpocznijPrzeglad(s);
		
	}

	@Override
	public void zakonczPrzeglad(Samochod s) {
		p.zakonczPrzeglad(s);
		
	}

	
	

}
