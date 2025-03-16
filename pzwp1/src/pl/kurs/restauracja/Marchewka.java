package pl.kurs.restauracja;

public class Marchewka extends Skladnik{
	public String toString() {
		return "marchewka";
	}
	public void obierz() {
		System.out.println("Obieranie marchewki");
	}
	public void pokroj() {
		System.out.println("Krojenie marchewki");
	}
	@Override
	public void przygotuj() {
		obierz();
		pokroj();
		
	}
}
