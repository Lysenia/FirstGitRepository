package arrays;

import java.sql.Array;
import java.util.Arrays;

public class Books {

	public static void main (String args[]) {
		
		String [][]bag = new String [3][3];
		
		System.out.println(Arrays.deepToString(bag));
		
		
		
		bag[0][0] = "The fellowship of the ring";
		bag[0][1] = "Talken";
		bag[0][2] = "fantasy";
	
		
		bag[1][0] = "1984";
		bag[1][1] = "Orwel";
		bag[1][2] = "fantasy";
		
		
		
		bag[2][0] = "Three man on a boat";
		bag[2][1] = "Smith";
		bag[2][2] = "drama";
		
		System.out.println(Arrays.deepToString(bag));
		
//		for(String[]book:bag) {
//			for(String bookInfo:book) {
//				System.out.println(bookInfo);
//				if(bookInfo.equals("fantasy")) {
//				System.out.println("found it");
//				}
//			}
//			System.out.println();
		
//		
//		for(String [] book: bag) {
//			String genre = book[2];
//		if(genre.equals("fantasy")) {
//			System.out.println(Arrays.toString(book));
		
		for(int i =0; i<bag.length; i++) {
			String [] book = bag[i];
			String genre = book[2];
			if(genre.equals("fantasy")) {
System.out.println(Arrays.toString(book));
		}
}
	
	}
}
		
		
			

		
		
		
	

