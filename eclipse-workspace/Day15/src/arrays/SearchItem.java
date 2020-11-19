package arrays;

public class SearchItem {
	public static void main(String[] args) {
		String products [] = new String [] {"Apples", "Bananas", "Oranges", "Lemons", "Carrots"};

		for (int i =0; i<products.length; i++) {
			if(products[i].equals("Apples")) {
				System.out.println("Bingo! Pear is found at location: " + i);
				break;
			}
		}
}
}
