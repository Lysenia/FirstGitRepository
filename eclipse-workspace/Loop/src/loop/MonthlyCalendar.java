package loop;

import java.util.Scanner;

public class MonthlyCalendar {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int days = 31;
		int firstDay = 0;
		
		System.out.print("Enter the name of month:");
		String monthName = scan.nextLine();
		System.out.print("Enter the number of days:");
		days =  scan.nextInt();
		System.out.print("First day of the month:");
		firstDay =  scan.nextInt();
		
		System.out.println("Month Calendar");
		System.out.println("Month:" + monthName);
		System.out.println("S\tM\tT\tW\tT\tF\tS");
		
		for(int j = 1; j<= firstDay; j++) {
			System.out.print("\t");
		}
		for(int i = 1 ; i<= days; i ++) {
			System.out.print(i + "\t");
			if((i+firstDay) % 7 == 0) System.out.println();
		}
	}		

}
