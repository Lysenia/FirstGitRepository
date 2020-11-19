package oca;

public class ArrayTroDim {
	
	static String table[][];
	



	public static void main(String args[]) {
		
		String x[] = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
		String y[] = {"1","2","3","4","5"};
		String y2[] = {"a","b","c"};
		
		table = new String[3][0];
		table[0] = x;
		table[1] = y;
		table[2] = y2;
		
		for(String row[]:table) {
			System.out.print(row[0]);
		
//		for(int i=0; i<table.length-1; i++) {
//			int j = table[1].length-1;
//			System.out.println(table[i][j]);
			
			try {
				int n = 100;
				int n2 = n/0;
			}catch(ArithmeticException e) {
				System.out.println("can not divide by zero");
			e.printStackTrace();
			}
		}
		int nums [] = new int[] {1,4,6};
		Object p = nums;
	String []two = (String[])p;	
	}
}
		


