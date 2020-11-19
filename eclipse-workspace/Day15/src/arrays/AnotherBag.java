package arrays;

import java.util.Arrays;

public class AnotherBag {
	public static void main(String args[]) {
	
	String [][]bag = new String [3][3];
	
	
	bag[0][0] = "The fellowship of the ring";
	bag[0][1] = "Talken";
	bag[0][2] = "fantasy";

	
	bag[1][0] = "1984";
	bag[1][1] = "Orwel";
	bag[1][2] = "fantasy";
	
	
	
	bag[2][0] = "Three man on a boat";
	bag[2][1] = "Smith";
	bag[2][2] = "drama";
	
	String expectedTitle = "Tree man on a boat";
	
	for(int i=0; i<bag.length; i++) {
		for(int j=0; j<bag[i].length; j++) {
			if(bag[i][j].equals(expectedTitle)) {
				System.out.println(bag[i][j].toString());
				for(String string: bag[i]) {
				System.out.println(string);	
				}
		}
			break;
	}
	}
	

	}
}
