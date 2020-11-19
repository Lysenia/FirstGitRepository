package arrays;

import java.util.Random;

public class RandomSimple {
	public static void main (String args[]) {
		Random rand = new Random();
		
		int num = rand.nextInt(6);
		System.out.println(num);
		
		int [] days = new int [8];
		
		for(int i =0; i<days.length; i++) {
			days[i] = rand.nextInt(6);
		}
		
		for(int day:days) {
			System.out.print(day + " ");
		}
	}
	
	

}
