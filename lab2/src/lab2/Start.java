package lab2;

public class Start {

	public static void main(String[] args) {
		
/*		Liczydlo liczydlo1 = Liczydlo.getInstance();
		Liczydlo liczydlo2 = Liczydlo.getInstance();

		liczydlo1.start();
		liczydlo2.start();
		liczydlo1.dodaj(10);
		liczydlo2.dodaj(5);
		
		liczydlo1.wynik();
		liczydlo2.wynik();

	}*/
	
	for(int i=0;i<10;i++) { 
		Liczydlo liczydlo = Liczydlo.getInstance(); 
		liczydlo.start(); 
		liczydlo.dodaj(12); 
		liczydlo.wynik(); 
		} 

}
}
