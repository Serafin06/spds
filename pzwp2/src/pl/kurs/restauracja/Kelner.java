package pl.kurs.restauracja;

public class Kelner implements Podawacz {
	
		
	public void podaj(Zupa zupa) {
		System.out.println("Podanie obiadu");
		System.out.println("Podaj� "+zupa.nazwa+ " do sto�u");
	
	}

}
