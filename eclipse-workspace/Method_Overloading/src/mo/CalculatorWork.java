package mo;

public class CalculatorWork {
	
	public static void main (String args[]) {
		
		OverloadedCalculator c1 = new OverloadedCalculator();
		
		System.out.println(c1.add(2));
		
		c1.add(2.0, 2.5f);
		int []array = {1,2,3,4,5};
		System.out.println(c1.add(array));
		
		long [] longArr = {19, 120, 17, 5};
		System.out.println(c1.add(longArr));
		
}
}