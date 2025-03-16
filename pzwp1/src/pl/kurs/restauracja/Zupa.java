package pl.kurs.restauracja;

import java.util.ArrayList;
import java.util.List;

public class Zupa {
	List<Skladnik> skladniki = new ArrayList<Skladnik>();
	
	String nazwa;
		
	public void przygotuj() {
		System.out.println("Przygotowanie zupy ze sk�adnik�w: "+skladniki);
		System.out.println("Nalewam wod� do garnka");
		zainicjuj();
		for(Skladnik skladnik:skladniki) {
			skladnik.przygotuj();			
			
		}
			
	}
	public void zainicjuj() {
		System.out.println("Wrzucam kostk� roso�ow�");
		nazwa = "ros�";
		
	}
	
	public void podaj() {
		System.out.println("Podanie obiadu");
		System.out.println("Podaj� "+nazwa+ " do sto�u");
	}
	
}
