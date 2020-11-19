package go;

public class Test34_2 {
	
	public static void main(String args[]) {
		String s = "Java Duke";
		int len = s.trim().length();
		System.out.println(len);
		
		StringBuilder sb = new StringBuilder();
		sb.append("apple");
		sb.append("mango");
		sb.delete(0, sb.length());
		System.out.println(sb.toString().isEmpty());
	}

}
