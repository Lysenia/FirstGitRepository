package mo;

public class MethodWrapper {
	
	public static void main(String args[]) {
		
//		X.parseX ------it will return a primitive value
//		X.valueOf --------will return a wrapper object
		
		add(new Long("123"));
		add(Long.valueOf(123));
		add(123L);
		add(123L);
//		add(Integer.valueOf(123)); - does not convert from one Wrapper Class to other Wrapper Class 
//		automatically. Cast is needed. 
		
		char c = 'c';
		byte b = (byte )c;
		
		
		

	}




public static void add(Long l) {
	
}

//public static void add(long l) {
//	
//}
}