package pl.kurs.restauracja;

public class Makaron extends Skladnik{
	@Override
	public String toString() {
		return "makaron";
	}
	
	public void gotuj() {
		System.out.println("Gotowanie makaronu");
	}

	@Override
	public void przygotuj() {
		gotuj();
		
	}
	
}
