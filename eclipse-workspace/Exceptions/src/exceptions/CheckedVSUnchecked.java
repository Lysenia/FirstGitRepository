package exceptions;

public class CheckedVSUnchecked {
	
	public static void main(String args[]) {
		
		try {
			Thread.sleep(2002);
		} catch (InterruptedException e) {
			System.out.println("can not sleep");
		}
		System.out.println("slept for 2020 and woke up");
	}

}
