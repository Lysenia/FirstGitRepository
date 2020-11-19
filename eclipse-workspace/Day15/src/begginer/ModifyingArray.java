package begginer;

import java.util.Scanner;

public class ModifyingArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a sentence:");
		String line = scan.nextLine();
		
		String [] words = line.split(" ");
		String inverted = "";
		
//		char[] letters = line.toCharArray();
		
		for(String eachWord : words){           
            for(int i=0;i<eachWord.length();i++){
                inverted+=eachWord.charAt(eachWord.length()-1-i);
            }
            inverted+=" ";

		
	}
		System.out.print(inverted);
}
}
