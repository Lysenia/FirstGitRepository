package go;

import java.util.ArrayList;

public class Test45 {
	
	public static void main(String args[]) {
		
		ArrayList myList = new ArrayList();
		
		String[] myArr;
		
		try {
			while(true) {
				myList.add("My String");
			}
		}
		catch(RuntimeException re) {
			System.out.println("Caught a runtime exception");
			
		}
catch(Exception e) {
	System.out.println("Caught an exception");
}
		System.out.println("Ready to use");
}
}
