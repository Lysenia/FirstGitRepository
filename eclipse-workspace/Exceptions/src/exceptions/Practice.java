package exceptions;

public class Practice {
	
	public static void main(String args[]) {
		
		System.out.println("beginning of the program");
		
		double a = 2;
		double b = 0;
		Object o = new String();
		
		
		int division =0;
		
		try {
			division = (int) (a/b);
			String s = (String)o;
			
		}
		
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
			System.out.println("exception is caught. you can not divide by zero");
		}
		catch(ClassCastException c) {
			System.out.println("exception is caught. you can not divide by zero");
	}
		
		System.out.println("end of divide");
	}
	 
		
	}

