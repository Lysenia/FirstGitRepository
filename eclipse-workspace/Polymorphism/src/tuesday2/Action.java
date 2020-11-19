package tuesday2;

public class Action extends Movie{

	int actionLevel;
	
	public Action(String name, double movieLength, int actionLevel) {
		super(name, movieLength);
		this.actionLevel=actionLevel;
		// TODO Auto-generated constructor stub
	}


	@Override
	public void printMovieInfo() {
		
	System.out.println("movie name " + name + " action level " + actionLevel + " movie length " + movieLength);
		
	}
	
	
}
