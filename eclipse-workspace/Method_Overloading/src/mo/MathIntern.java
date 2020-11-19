package mo;

public class MathIntern {
	
	public static final double PI;
	public static int num;
	
//	static block runs before main method and only once, no matter how many objects you create
	
	static {
		System.out.println("Intern is doing intence research");
		PI = Math.PI;
		num = 1;
	}
	
	static {
		System.out.println("Intern is done research");
	num =2;
	}
	

	static {
		System.out.println("Intern is really done research");
	num =3;
	}
	
	
	public static void main (String args[]) {
		
		System.out.println("main started");
		MathIntern m1 = new MathIntern();
		MathIntern m2 = new MathIntern();
		System.out.println(num);
		System.out.println("main ended");
		
	}
	

}
