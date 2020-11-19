package sts;

public class StaticMethod {
	
	static double price;
	
	public static void printMessage() {
		System.out.println("static message");
	}

	public static void main (String args[]) {
		
		printMessage();
		System.out.println(price);
		
//		System.out.println(Character.isAlphabetic('B'));
//		System.out.println(Character.isDigit('2'));
//		System.out.println(Integer.parseInt("12344"));
//		
//		System.out.println(Math.pow(10, 3));
		
	}
}
