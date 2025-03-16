package pl.kurs.restauracja;

public class Ryz extends Skladnik {
	@Override
	public String toString() {
		return "ryz";
	}
	
	public void gotuj() {
		System.out.println("Gotowanie ryzu");
	}

	@Override
	public void przygotuj() {
		gotuj();
		
	}

}
