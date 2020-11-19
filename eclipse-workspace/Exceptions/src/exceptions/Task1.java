package exceptions;

public class Task1 {
	
	public String reverse (String str) {
		String reverse = "";
		if(str==null) {
			throw new NullPointerException();
		}
		else {
			for(int i = str. length() - 1; i >= 0; i--) {
				reverse = reverse + str. charAt(i); }
		}
			
		return reverse;
		
	}
	
	public static void main(String args) {
		
		try {
			Task1 task = new Task1();
			task.reverse("Java");
			
		} catch(NullPointerException e){
			System.out.println("Exception caught");
		}
		
		finally {
			System.out.println("finally is running");
		}
	
	}

}
