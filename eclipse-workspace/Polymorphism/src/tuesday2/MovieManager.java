package tuesday2;

public class MovieManager {
	
	public static void displayMovieInfo(Action a) {
		System.out.println("action Movie object method");
		a.printMovieInfo();
	}
	
	public static void displayMovieInfo(Movie a) {
		a.printMovieInfo();
		System.out.println("movie object method");
	}
	
	public static void displayDrama(DramaMaker m) {
	
		System.out.println("drama makes us cry");
	}
	
	
	public static void main(String args[]) {
		
		Movie m1 = new Action("Home Alone", 1.45,1);
		Movie m2 = new Drama("Titanic", 2.0,5);
		
		Action a =new Action("Jumahji",2.00,4);
		
		DramaMaker m = new Drama("Jane Air", 2.10, 4);
		
		
		
		
//	m1.printMovieInfo();
//	m2.printMovieInfo();
	
	MovieManager.displayMovieInfo(a);
	MovieManager.displayMovieInfo(m1);
	MovieManager.displayMovieInfo(m2);
		
	}

}
