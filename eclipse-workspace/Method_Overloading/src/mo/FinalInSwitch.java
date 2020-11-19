package mo;

public class FinalInSwitch {

	public static void main(String args[]) {
		int i = 10;
		final int j = 10;
//		in switch only final variable can be used, if not a literal
//		method parameter can not be used as a case
		
		switch (i) {
		case 5:
			System.out.println("it's less");
			break;
		case j:
			System.out.println("it's equal");
			break;
		case 12:
			System.out.println("it's more");
			break;
		}
	}
}
