package wrc;

public class Wrapping {
	
	public static void main (String args[]) {

		
		Byte b = new Byte ("123");
		Byte b1 = new Byte ((byte) 123);
		Character ch = new Character ('g');
		Boolean bul = new Boolean (true);
		Boolean bul1 = new Boolean ("true");
		Short sh = new Short((short) 1200);
		Integer i = new Integer (12345);
		Double d = new Double (3.1415926);
		Float f1 = new Float(33.4f);
		Long l = new Long (23455778);
		
//		autoboxing;
		Character x = 'x'; 
		int num = new Integer(12);
//		autounboxing;
		
		
		boolean t = Boolean.parseBoolean("false");
		System.out.println("converting from String to primitive  " + t);
		Boolean g = Boolean.valueOf("true");
		t=g;
		System.out.println("converting from primitive to String  " + t + " " + g);
		
		
		Byte.parseByte("4");
		Byte.valueOf("4");
		
		Short.parseShort("5");
		Short.valueOf("5");
		
		
		Integer.parseInt("12");
		Integer.valueOf("12");
		
		Long.parseLong("123455");
		Long.valueOf("123455");
		
		Double.parseDouble("22.3");
		Double.valueOf("12.34");
		
		Float.parseFloat("123");
		Float.valueOf("123");
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Character.isDigit('Z'));
		System.out.println(Character.isDigit('9'));
		System.out.println(Character.isAlphabetic('Z'));
		
		
}
	
}
