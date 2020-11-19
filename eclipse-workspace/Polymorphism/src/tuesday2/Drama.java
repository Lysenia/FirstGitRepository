package tuesday2;

public class Drama extends Movie implements DramaMaker{
	
	int dramaLevel;
	
	public Drama(String name, double movieLength, int dramaLevel) {
		super(name, movieLength);
		this.dramaLevel = dramaLevel;
		// TODO Auto-generated constructor stub
	}


	@Override
	public void printMovieInfo() {
     System.out.println("movie name " + name + " drama level " + dramaLevel + " movie length " 
	+ movieLength);
		
	}


	@Override
	public void makeYouCry() {
		System.out.println();
		
	}
	

}
