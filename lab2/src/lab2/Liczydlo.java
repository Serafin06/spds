package lab2;

import java.util.ArrayList;
import java.util.List;

public class Liczydlo {
	private int wynik = 0;

	private Liczydlo() {
	};
	
	 static List<Liczydlo> liczydla = new ArrayList<Liczydlo>();
	 static {
		 liczydla.add(new Liczydlo());
		 liczydla.add(new Liczydlo());
		 liczydla.add(new Liczydlo());
	 }

	public void start() {
		System.out.println("[" + hashCode() + "] Zaczynam obliczenia");
		wynik = 0;
	}

	public void dodaj(int x) {
		System.out.println("[" + hashCode() + "] Dodaję " + x);
		wynik += x;
	}

	public void wynik() {
		System.out.println("[" + hashCode() + "] Koniec obliczeń, wynik=" + wynik);
		//flaga = Boolean.TRUE;
		liczydla.add(this);
		
	}

	//private static Liczydlo INSTANCE = new Liczydlo();
	//private static Boolean flaga = Boolean.TRUE;

	public static Liczydlo getInstance(){
//		if (flaga) {
//			flaga = Boolean.FALSE;
//			return INSTANCE;
//		}
		if(liczydla.size()>0) {
			return liczydla.remove(0);
		}
		return null;
		
	}
}