package go;
//Test42
public class CCMask {
	
public static String maskCC(String creditCard) {
String x = "XXXX XXXX XXXX ";
StringBuilder sb = new StringBuilder(x);
sb.append(creditCard.substring(15, 19));
return sb.toString();
//		return x + creditCard.substring(15, 19);
	}
	
	public static void main(String args[]) {
		System.out.println(maskCC("1234-5678-9101-1234"));
	}

}
