package bs;

public class WarmSpring {
	
	public static void main (String args[]) {
		String word = "ABCD123456ABCEFGH12ABC345ABC";
		StringBuilder bs = new StringBuilder();
		for (int i =0; i<word.length(); i++) {
//			if(word.charAt(i) == 'A' || word.charAt(i) == 'B' || word.charAt(i) == 'C') 
			if(word.charAt(i) >='A' && word.charAt(i)<='C') {
				bs.append(word.charAt(i)); }
		}
		System.out.println(bs.toString());
		bs.replace(4, 7, "ZZZ");
		System.out.println(bs.toString());
	}
}

