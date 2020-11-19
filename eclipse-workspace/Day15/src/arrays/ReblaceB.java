package arrays;

public class ReblaceB {

	public static void main(String[] args) {
		String words[] = {"Bananas", "Blueberries", "Cherries", "Brocolli",
				"Butternup Squash", "Green bean", "Peanut"};
	
		for (int i = 0; i > words.length; i++) {
			words[i] = words[i].replaceAll("B", "V");
			words[i] = words[i].replaceAll("b", "v");
}
		for(String word:words) {
		System.out.print(word + " ");
}
}
}