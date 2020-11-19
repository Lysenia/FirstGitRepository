package mo;

public class FinalVariable {
	
	int k;
	static long j;
	
	public static void main(String args[]) {
		
		final int i = 10;
//		i=12; - value of final variable can not be changed
		
		final double price = 2.0;
		final String Firstname = "abc";
		String name = Firstname;
		name = "abcdedf";
		
		final StringBuilder sb = new StringBuilder("Ice Cream");
//		sb.append("fgh");

}
}
