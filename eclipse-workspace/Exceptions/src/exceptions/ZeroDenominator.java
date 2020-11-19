package exceptions;

public class ZeroDenominator {
	
	public static void main(String args[]) {
		
		
		try {
			int n = 100;
			int n2 = n/0;
		}catch(ArithmeticException e) {
			System.out.println("can not divide by zero");
		e.printStackTrace();
		}
	}

}
