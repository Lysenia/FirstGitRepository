package artist;

public class Artists {
	
	private String name;
	private int songCount;
	
	public void setName (String theName) {
		name = theName;
	}
	public void setsongCount (int theSongCount) {
		songCount = theSongCount;
	}
	
	public String getName() {
		return name;
	}

	public int getSongCount(){
		return songCount;
	}
	
	public void displayInfo() {
		
		System.out.println( "Artist [name =  " + name + "," 
	+ "songCount = " + songCount + "]");
	}
}
