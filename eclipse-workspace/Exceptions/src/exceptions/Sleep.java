package exceptions;

public class Sleep {
	
	public static void main(String args) {
		
		
		System.out.println("Beginning");
		
		try {
			
//			throw new Throwable();
//			throw new Exception();
			throw new RuntimeException();
//			new RuntimeException(); - creates an object, but does not throw an exception
//			System.out.println("code here");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println("I caught an exception");
		}
		finally {
			System.out.println("finally");
			throw new NullPointerException();
		}
//		System.out.println("ending"); will not be reached, the exception from finally will be shown
//		try {
//			Thread.sleep(2000);
//		
//			
//		} catch(InterruptedException e){
//			System.out.println("Interrupted caught");
//		}
//		
//		System.out.println("ending");
//		
}

}
