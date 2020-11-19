package str;

public class StringEquality {

	public static void main (String args[]) {
		String strLiteral = "ABC";
		String otherNewString = new String("ABC");
		String anotherLiteral = "ABC";
		
		System.out.println(strLiteral == anotherLiteral );
		System.out.println(strLiteral == otherNewString );
		System.out.println (strLiteral.equals(otherNewString));
		
//		char [] arr = {'a', 'b', 'c'};
//		String str3 = new String(arr);
		
		String s5 = "pool";
		s5 = s5.concat("abc");
		System.out.println(s5);
		
		String s6 = "ABCDEFG";
		String s7 = "ABC";
		String s8 = "DEFG";
		
		System.out.println(s6 == s7+s8);
		
	}
}
