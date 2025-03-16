package pl.kurs.restauracja;

import java.util.ArrayList;
import java.util.List;

public class Kucharz {
	
	List<Skladnik> skladniki = new ArrayList<Skladnik>();
	
			
	public void przygotuj(Zupa zupa) {
		System.out.println("Przygotowanie zupy ze sk�adnik�w: "+skladniki);
		System.out.println("Nalewam wod� do garnka");
		zupa.zainicjuj();
		for(Skladnik skladnik:skladniki) {
			skladnik.przygotuj();			
			
		}
	}

}
