package mo;

public class MathApp {

//	final field should be given value on the same or
//	needs to get initialized before constructor finish
//  or in initializing block
	
// not chance not to be initialized for a final variable
	
//	once the first assignment is given, no more assignment allowed after it
	
	final int num1;
	int num2;
	static int num3;
	final static int NUM4 = 10;
//	static final int is also allowed, but final int static will not compile
	
	public MathApp (int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
		
	}
	
	public static void main(String args[]) {
		MathApp app = new MathApp(5,8);
		System.out.println(app.num1);
//		app.num1 = 1; - does not compile
		app.num2 = 11;
		
	}
}
