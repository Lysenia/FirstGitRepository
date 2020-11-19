package arrays;

public class Spliter {
	public static void main(String[] args) {
		String sentence = "find out how many";
		int before = sentence.length();
		sentence = sentence.replace(" ", "");
		int after = sentence.length();
		int numberOfWords = (before - after) + 1;
		 System.out.println("Number of words:" + numberOfWords );
		 sentence = "find out how many";
		 String [] arrWords = sentence.split(" ");
		 System.out.println("Number of words " + arrWords.length);
		 for(String word:arrWords) {
			 System.out.println(word);
		 }
			 
		 
	}
	
}
