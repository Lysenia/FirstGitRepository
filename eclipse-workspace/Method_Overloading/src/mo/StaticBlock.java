package mo;

public class StaticBlock {

	public static int k = 11;
	public static final String grade;
	
	static{
		if(k>10)
			grade = "A";
		else 
			grade = "B";
			
			System.out.println("message from static block");
		
		
	}
	


public static void main (String args[]) {
	
	System.out.println(grade);
	
}
}