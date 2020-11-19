package tracker;

import audio.Song;
import shape.Rectangle;
import video.Movie;

import java.util.Scanner;



public class Printer {
	
	
	
	public static void main (String args[]) {
		
		
		Rectangle r1 = new Rectangle(12.1, 22);
		
		Movie m1 = new Movie("Titanic", 2.45);
		
		Song s1 = new Song ("Hello", "Adele");
	
		printShapes(r1);
		
//		java.util.Scanner scan = new java.util.Scanner(System.in);
		
	}
	
	public static void printShapes (Rectangle r1) {
		System.out.println(" the width of the rectangle is " + r1.getWidth() + " height is " + r1.getHeight() );
			
		}

}
