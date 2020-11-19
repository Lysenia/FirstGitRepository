package exceptions;

public class RunTimeExceptions {

	public static void main(String args[]) {
		try {
		
		String str [] = {"One", "two","three"};
		System.out.println(str[3]);
		}  catch(Exception e) {
			System.out.println("wrong index");
			
		}
	System.out.println("after array");
}
}

