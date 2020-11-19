package exceptions;

public class MoreException {
	
	public static void main(String args[]) {
		
		String s = null;
		
		System.out.println("Beginning of the program");
		try {
			System.exit(0);
			s.concat("123");
		}
		
		catch(NullPointerException e){
			System.out.println("null pointer exception");
			try {
				
				int d = 6/0;
//				System.exit(0);
			}
			catch(NullPointerException a){
				System.out.println("null pointer exception");
		}
			finally {
				System.out.println("can not handle it");
			}
	}

	}
}
