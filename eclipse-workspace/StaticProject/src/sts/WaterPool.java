package sts;

public class WaterPool {

	public static void main (String args[]) {
		
		Water w1 = new Water("Adam", 25);
//		Water.count++;
		
		Water w2 = new Water("Eve", 27);
//		Water.count++;
		
		w1.getName();
		w1.getName();
		w1.getName();
		w1.getName();
		
		System.out.println(Water.count);
		System.out.println(Water.countOfGetNameCall);
	}
}
