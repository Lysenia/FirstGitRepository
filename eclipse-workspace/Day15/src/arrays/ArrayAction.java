package arrays;

import java.util.Random;

public class ArrayAction {
	public static void main (String args[]) {
		Random rand = new Random();

int [] days = new int [7];
		
		for(int i =0; i<days.length; i++) {
			days[i] = rand.nextInt(7);
		}
	int count = 0;
	String str = "";
	String dayNames [] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	
	for(int day : days) {
	switch(day) {
	case 0: str = "Sunday"; 
count++;
	break; 
	case 1: 
	str = "Monday"; 
	break; 
	case 2: 
	str = "Tuesday"; 
	break; 
	case 3: 
	str = "Wednesday"; 
	break; 
	case 4:
	str = "Thursday"; 
	break; 
	case 5: 
		str = "Friday"; 
		break; 
		case 6: 
			str = "Saturday"; 
count++; 
			break; 
			default: 
				str = "Wrong entry"; 
				break; }
//	if (day ==0 || day ==6) {
//		count++;
//	}
		System.out.println("Item " + day + " is " + str); } 
	System.out.println("There are " + count + " weekends.");
		
				
		
	}
}

