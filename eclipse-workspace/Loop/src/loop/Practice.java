package loop;

public class Practice {
	public static void main(String[] args) {
		
		String str = "JOB hunTER";
		System.out.println(str.length());
		System.out.println(str.charAt(4));
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		System.out.println(str.substring(1,3));
		
		
		System.out.println(str.substring(0,2) + str.substring(2,3).toLowerCase());
	
		
		
		
		String bigger = str.substring(4).toUpperCase();
		String bigger2 = bigger.toUpperCase();
		System.out.println(bigger2);
	
	}

}
