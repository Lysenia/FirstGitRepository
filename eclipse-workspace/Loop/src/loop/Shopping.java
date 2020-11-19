package loop;

import java.util.Scanner;

public class Shopping {
	public static void main(String[] args) {
	
	int budget = 500;
	int maxItems = 5;
	
	boolean hasMoney = true;
	int totalSpent = 0;
	int lefToSpend = budget;
	int numberOfItems = 0;
	int price = 0;
	
	Scanner sc = new Scanner(System.in);
	
	while(hasMoney && numberOfItems < maxItems){
		System.out.println("Total spent" + totalSpent + "\t Left: $" + lefToSpend + "\tNumber of Items" + numberOfItems);
		System.out.println("next item price");
		price = sc.nextInt();
		if(price>lefToSpend) {
			System.out.println("Ask for more money");
			
		}
	}
}

}
