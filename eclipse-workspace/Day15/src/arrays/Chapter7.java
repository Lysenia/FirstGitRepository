package arrays;

import java.util.Scanner;

public class Chapter7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] sleep = new double[20];
		System.out.print("Enter how many hours you slept for the last 20 days:");
		double dereviation = 0;
		double lastHourSleep = 0;
		for (int index=0; index<sleep.length; index++) {
			 sleep [index] = sc.nextDouble();
			 lastHourSleep = sleep.length - 1; 
//			dereviation = lastHourSleep  - sleep [index];
			
		}
		System.out.print ("Last our of your sleep was" + lastHourSleep);
		
		for (int index=0; index<sleep.length; index++) {
			dereviation = lastHourSleep  - sleep [index];
		System.out.println("You slept:"  + dereviation + 
				"comparing to the last night");
	}
}
}
