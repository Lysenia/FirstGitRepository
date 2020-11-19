package arrays;

import java.util.Scanner;

public class WarmUp {
	public static void main(String[] args) {
		String items [] = {"Apples", "Bananas", "Oranges", "Lemons", "Carrots"};
		double[] prices = new double [5];
		double total =0;
		double average =0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0;i<items.length; i++ ) {
			System.out.println("Enter the price for" + " " + items[i].toUpperCase() );
			prices[i] = sc.nextDouble();
			total+= prices[i]; 
			average = (total/prices.length);
			System.out.println( items[i].toUpperCase() + " " + "the price is" + " " + prices[i]);

		}
		
		System.out.println("You spent " + total + "on shopping today" );
		System.out.print("The average for an item is " + " " + average);
}
		


}
