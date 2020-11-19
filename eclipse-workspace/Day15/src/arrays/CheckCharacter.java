package arrays;

public class CheckCharacter {
	public static void main(String[] args) {
		String str = "Cybertek";

		for (int i =0; i<str.length(); i++) {
				if(str.charAt(i) =='r') {
					System.out.println("letter r is found at index" + i);
				break;
				
			}
		}
		System.out.println( "letter r is found at index"  + str.indexOf("r"));	
	}
}

