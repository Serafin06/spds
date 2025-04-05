package lab4.zoo;

public class Klatka {

	public static void main(String[] args) {
		LewCtx lew = new LewCtx(); 
		System.out.println("==Zaczepiam lwa"); 
		lew.zaczep(); 
		System.out.println("==Karmię lwa"); 
		lew.nakarm(); 
		System.out.println("==Zaczepiam lwa"); 
		lew.zaczep(); 
		System.out.println("==Śpiewam lwu"); 
		lew.zaspiewaj(); 
		System.out.println("==Odbieram lwu jedzenie"); 
		lew.odbierz(); 
		System.out.println("==Śpiewam lwu"); 
		lew.zaspiewaj(); 
		System.out.println("==Odbieram lwu jedzenie"); 
		lew.odbierz(); 

	}

}
