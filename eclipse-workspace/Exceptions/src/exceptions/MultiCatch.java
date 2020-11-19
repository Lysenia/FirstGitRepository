package exceptions;

public class MultiCatch {
	public static void main(String args[]) {
		System.out.println("beginning of the program");
		
		int arr [] = new int[4];
		int i = 0;
		
		try {
			System.out.println(arr[4]);
		}
		catch(ArithmeticException e){
			
		}
		
		System.out.println("ending the program");
	}
}
