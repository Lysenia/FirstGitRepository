package arrays;

public class StringSplit {
	public static void main(String[] args) {
//		String str = "I love Java";
//		String [] strArr = str.split("a");
//		
//		for(String word: strArr) {
//			System.out.println(" my word is: " + word);
//		}
//		
	String str2 = "Today I learn Java For Each Loop"	;
	String [] strArr2 = str2.split(" ");
	
	System.out.println("For Each Loop");
	System.out.println();
	for(String word2: strArr2) {
		System.out.println(word2 + " has   " + word2.length() + "  characters  ");
	}
	
	System.out.println("For Loop");
	System.out.println();
	
	for( int i = 0; i< strArr2.length; i++) {
		System.out.println(strArr2[i] + " has  " + strArr2[i].length()  + " characters");
}
	System.out.println("While Loop");
	System.out.println();
	int j = 0;
	
	while (j<strArr2.length) {
		System.out.println(strArr2[j] + " has  " + strArr2[j].length()  + " characters");
		j++;
	}
System.out.println(" Do While Loop");
System.out.println();
	
	int k = 0;
	do {
		System.out.println(strArr2[k] + "has  " + strArr2[k].length()  + " characters");
		k++;
	}
	while (k<strArr2.length);
		
		
}
}