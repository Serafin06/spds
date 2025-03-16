package pl.kurs.restauracja;

public class ZupaNaWynos implements Podawacz, Adresowalny {
	
	private String adres;

		
	@Override
	public void podaj(Zupa zupa) {
		System.out.println("Wysylam "+zupa.nazwa+" do "+adres);
	}

	@Override
	public void setAdres(String adres) {
		this.adres = adres;
		
		
	}

	public String getAdres() {
		return adres;
	}

}
