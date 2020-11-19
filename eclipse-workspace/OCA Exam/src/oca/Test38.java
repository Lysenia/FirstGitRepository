package oca;

public class Test38 {
	
	public static void main(String[] args) {
		
		
		try {
			int num = 10;
			int div = 0;
			int ans = num/div;
					
		} catch(ArithmeticException ae) {
//ans = 0; - compile error
		} catch(Exception e) {
		System.out.println("Invalid calculation");
//		System.out.println("answer" +ans); compile error
}
}
}
