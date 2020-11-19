package sts;

public class StringRunner {
	
	public static void main (String args[]) {
		
		
		MyStringToolBox m = new MyStringToolBox("ABCD1234frt");
		int sum = m.calculateSum();
		System.out.println(sum);
		
		
		
		System.out.println(m.getList());
	}

}
