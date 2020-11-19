package arrays;

public class SearchSplit {
	public static void main(String[] args) {
		String googleSearchResult = "About 13,500,00 results (0,57 seconds)";
		
		String result[] = googleSearchResult.split(" ");
		System.out.println(result.length);
		System.out.println(result[1]);
		System.out.println(result[3].replace("(", ""));
		
		String seconds [] = googleSearchResult.split("results");
		System.out.println(seconds.length);
		System.out.println(seconds[1]);
		System.out.println(seconds[0]);
	}
}
