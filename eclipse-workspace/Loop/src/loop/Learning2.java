package loop;

public class Learning2 {
	public static void main(String[] args) {
		
		String str = "Cybertek Java";
		
		for(int i = 0; i<str.length(); i++) {
	if(str.charAt(i)=='J') {
		continue;	
}
	System.out.print(str.charAt(i) + "  ");
	}
}
}
