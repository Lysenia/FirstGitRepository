package artist;

import rev.Dog;

public class ArtistRunner {
	
	public static void main (String args[]) {
		
		Artists a1 = new Artists();
		a1.setName("Rossini");
		a1.setsongCount(3);
		
		Artists a2 = new Artists();
		a2.setName("Pitbull");
		a2.setsongCount(15);
		
		Artists a3 = new Artists();
		a3.setName("Elza");
		a3.setsongCount(23);
		
	
		Artists manyArtists [] = {a1, a2, a3}; 

		for(Artists eachArtist: manyArtists) {
			
			eachArtist.displayInfo();
			
		}

	
}
}