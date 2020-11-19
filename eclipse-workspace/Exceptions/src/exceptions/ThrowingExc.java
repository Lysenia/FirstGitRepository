package exceptions;

public class ThrowingExc {
	
	public static void main(String args[]) {
		
		System.out.println("Beginning");
		
		try {
//			ArithmeticException ae = new ArithmeticException();
//			throw ae;
			
			throw new ArithmeticException();
		} catch(NullPointerException e) {
			System.out.println("handling exception");
		}
		

		System.out.println("ending");
	}

}
