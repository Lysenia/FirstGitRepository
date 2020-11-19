package exceptions;

public class CheckedException {
	
	public static void main(String args[]) {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception occured");
		}
		System.out.println("The end");
	}

}
