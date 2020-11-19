package mo;

public class StaticBlockOrder {
	
	public static final String ORDER;
	public static int num;
	
	public static int doubleTheNumber () {
		System.out.println("Original number " + num);
		return num*2;
	}
	
//	CONSTANT = public static final
	
	static {  
		ORDER = "ONE";
		num =2;
		System.out.println("first block");
		
	}
	
static {
	System.out.println("second block");
	}

public StaticBlockOrder () {
	System.out.println("message from constructor");
}

public static void main (String args[]) {
	StaticBlockOrder block = new StaticBlockOrder (); 
	StaticBlockOrder block1 = new StaticBlockOrder (); 
	System.out.println(ORDER);
	System.out.println("result is " + doubleTheNumber());
	
}
}
