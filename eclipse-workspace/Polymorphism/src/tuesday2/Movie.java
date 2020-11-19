package tuesday2;

public abstract class Movie {
	
	String name;
	double movieLength;
	
	public Movie(String name, double movieLength) {
		super();
		this.name = name;
		this.movieLength = movieLength;
	}

	
	public abstract void printMovieInfo();
	
	
	
	

}
