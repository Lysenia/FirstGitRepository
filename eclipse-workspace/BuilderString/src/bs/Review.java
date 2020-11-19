package bs;

public class Review {
	
	public static void main(String args[]) {
		
		String str = "AZVFTDDDTD";
		
		StringBuilder sb  = new StringBuilder(str);
		
		int last = sb.lastIndexOf("D");
		int first = sb.indexOf("D");
		sb.deleteCharAt(last).deleteCharAt(first);
		
		System.out.println(sb.toString());
		
		sb.setCharAt(sb.indexOf("D"), 'K');
		sb.replace(sb.indexOf("D"), sb.indexOf("D")+1, "K");
		System.out.println(sb.toString());
		
		int v = sb.indexOf("V");
		
	sb.insert(v+1, "ictory");
	System.out.println(sb.toString());
	
	char ch = sb.charAt(4);
	
	System.out.println("4th position belongs to letter   " + ch);
	
	
	
		
	}

}
