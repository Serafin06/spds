package lab2_3;

import java.util.ArrayList;
import java.util.List;

public class Magazyn {
	List<Artykul> artykuly = new ArrayList<Artykul>();

	public void addArtykul(Artykul artykul) {
		artykuly.add(artykul);
	}

	public List<Artykul> getArtykuly() {
		return artykuly;
	}

}