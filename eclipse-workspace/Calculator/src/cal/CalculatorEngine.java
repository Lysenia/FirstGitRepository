package cal;

public class CalculatorEngine {
	
	public static void main (String args[]) {
		
		int num1 = 10;
		int num2 = 2;
		
		System.out.println("working with numbers: " + num1 + ", " + num2);
		
		MathEquation m1 = new MathEquation ('a',num1,num2);
//		m1.execute();
//		System.out.println( " The opCode is "  + m1.getOpCode() + "the result is  " + m1.getResult());
		MathEquation m2 = new MathEquation ('s',num1,num2);
		MathEquation m3 = new MathEquation ('m',num1,num2);
		MathEquation m4 = new MathEquation ('d',num1,num2);
		MathEquation m5 = new MathEquation ('z',num1,num2);

		MathEquation equastioArr [] = { m1, m2, m3, m4,m5};
for (MathEquation each:equastioArr ) {
	each.execute();
System.out.println("The opCode is " + each.getOpCode() +  " The result is " + each.getResult());
}

m5.setOpCode('s');
m5.execute();
System.out.println("result is " + m5.getResult());
}
}

