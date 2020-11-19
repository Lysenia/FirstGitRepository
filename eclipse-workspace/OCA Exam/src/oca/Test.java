package oca;

public class Test {

	public static void main(String args[]) {
		
		int i, j, k;
	      i = j = k = 9;
	      System.out.println(i);
	      
		System.out.println("5+2 =" + 3 +4);
		System.out.println("5+2 =" + (3 +4));
		
		String st = " ";
		st.trim();
		System.out.println(st.equals("") + " " + st.isEmpty());
		
		int iInt = 100;
		float fFloat = 100.23f;
		double dDouble = 123;
		
	fFloat = iInt;
	
	String stt = "java class";
	int len = stt.trim().length();
//	trim does not work with spaces between words, only with spaces before the begging and end
	System.out.println(len);
	
		
		
//		int a = 9;
//		if(a++<10) {
//			System.out.println(a + "Good morning");
//		}
//		else {
//			System.out.println(a + "Good afternoon");
//		}
	}
}
