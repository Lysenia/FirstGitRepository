package mo;

public class FinalMethod {
	public static void main(String args[]) {

}


public static void add(final int num) {
//	num = 4 ; can not give new value to final variable
	System.out.println(num +5);
}

public static void add (final String s) {
//	s = "xxx";can not give new value to final variable
	System.out.println(s);
}

public static void add(final StringBuilder sb) {
	sb.append("avb");
	
}


}