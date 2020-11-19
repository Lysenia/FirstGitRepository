package abo;

public class Fraction2 {
	
	public int num;
	public int den;
	
	public Fraction2 (int n, int d) {
		num = n;
		den = d;
		
	}
	
	public String toString() {
		return num + "/" + den;
	}
	
	private int GCD(int a, int b) {
		if (b==0) return a;
		return GCD (a,a%b);
	}
	




public static void main (String args[]) {
	
//	Fraction2 fraction = new Fraction2();
	
}

}