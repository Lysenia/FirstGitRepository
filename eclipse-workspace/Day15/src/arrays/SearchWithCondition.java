package arrays;

public class SearchWithCondition {
	public static void main(String[] args) {
		String products [] = new String [] {"Apples", "Bananas", "Oranges", "Lemons", "Carrots"};

		for (int i =0; i<products.length; i++) {
			if(products[i].contains("p") ==true) {
				System.out.println("item" + products[i] + "found at location" + i );
			
			}
}
}
}