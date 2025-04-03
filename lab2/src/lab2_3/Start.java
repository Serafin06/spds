package lab2_3;

public class Start {

	public static void main(String[] args) {
		
		Runtime.getRuntime().gc();
		long freeMemory1 = Runtime.getRuntime().freeMemory();
		
		Magazyn[] magazyny = new Magazyn[100];
		for (int i = 0; i < magazyny.length; i++) {
			magazyny[i] = new Magazyn();
			for (int j = 0; j < 200; j++)
				magazyny[i].addArtykul(Artykul.getInstance("art" + j, j));
		}

		/*for (Magazyn m : magazyny)
			for (Artykul a : m.getArtykuly())
				System.out.println(a.getNazwa() + " " + a.getCena());
		*/
		
		
		
		Runtime.getRuntime().gc();
		long freeMemory2 = Runtime.getRuntime().freeMemory();
				
		System.out.println(freeMemory1 - freeMemory2 + " "+ Artykul.ile);
	}

}
