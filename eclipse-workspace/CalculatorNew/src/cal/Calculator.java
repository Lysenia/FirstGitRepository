package cal;


public class Calculator {
	
//	static double result =0;
	
	public static double  addNum(double num, double den) {
		double result = num+den;
		return result;
	}
	public static double  substructNum(double num, double den) {
		double result = num-den;
		return result;
	}
	
	public static double  multiplyNum(double num, double den) {
		double result = num*den;
		return result;
	}
	
	public static double  divideNum(double num, double den) {
		double result = num/den;
		return result;
	}
	
	public void printSomething() {
		System.out.println("lalala");
	}
	
	public static void main(String args[]) {
		
		System.out.println(addNum(3,2));
		System.out.println(substructNum(3,2));
		System.out.println(multiplyNum(3,2));
		System.out.println(divideNum(3,2));
		
		Calculator c = null;
//		c.addNum(30, 15) - will compile for null, because static method does not require any object
		Calculator.addNum(12, 10);
//		c.printSomething();
		
		String s = null;
		System.out.println(s.length());
		
		
	}
}
