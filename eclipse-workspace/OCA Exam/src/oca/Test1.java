package oca;

public class Test1 {
	
	public static final int MIN = 1;
	
	public static void main (String args[]) {
		
		int x = args.length;
		
		if(checkLimi(0)) {
			System.out.println("Java SE");}
		else {
			System.out.println("Java EE");
			
		}
	}


public static boolean checkLimi (int x) {
	return (x>=MIN)? true:false;
}
}