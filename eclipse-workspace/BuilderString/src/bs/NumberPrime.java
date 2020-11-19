package bs;

public class NumberPrime {
	
	public static void main (String args[]) {
		System.out.println(primeNumber(11));
		System.out.println(primeNumber(5));
		System.out.println(primeNumber(23));
	}
	
	public static boolean primeNumber(int number) {
		for(int i=2; i<number; i++) {
			if(number%i==0) {
				return false;
			}
		}
		return true;
	}

}
