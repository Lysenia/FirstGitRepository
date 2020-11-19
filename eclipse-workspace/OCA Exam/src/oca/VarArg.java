package oca;

public class VarArg {
	
	
	
	public static void sum(long...varArg) {
		long sum = 0;
		for(int i=0; i<varArg.length; i++) {
			sum=sum+varArg[i];
		
		}
		System.out.println("sum " + sum);
	}
	
	
	
	
//	public static void add(int i) {
//		
//	}
//public static void add(double d1, double d2) {
//		
//	}
//
//public static void add(int...numbers) {
//	


public static void main(String args[]) {
	
	
	long [] array = {1,2,3,4,5};
	sum(1);
	sum(1,2,3,4);
	sum(1,2,3,4,5,6,7,8,9,10);
	sum(array);

}
}
