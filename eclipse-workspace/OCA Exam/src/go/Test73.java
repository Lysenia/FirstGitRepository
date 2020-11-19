package go;

public class Test73 {
	
	String myStr = "7007";
	public void doStuff(String str) {
		int myNum =0;
		try {
			String myStr = str;
			myNum = Integer.parseInt(myStr);
		} catch(NumberFormatException ne) {
			System.err.println("error");
		}
		System.out.println("My String: " + myStr + ", My num: " + myNum);
	}
public static void main(String args[]) {
	
	Test73 obj = new Test73();
	obj.doStuff("9009");
	
}
}
