package sunday_Murodil;

import java.util.ArrayList;

public class Sum {
	
	public static int sumItUp(int a, int b) {
		return a+b;
		
	}
	
	public static int sumItUp(int a, int b, int c) {
		return a+b + c;
		
	}

	public static int sumItUp(int [] array) {
		int sum = 0;
		for(int i =0; i<array.length; i++) {
			sum = sum+array[i];
		}
		
		return sum;
		
	}
	
	public int sumItUp(ArrayList<Integer>list) {
		int sum = 0;
//		for(int n: list){
//		sum+=n;
//	}
		for(int i =0; i<list.size(); i++) {
			sum = sum + list.get(i);
		}
		
		return sum;
		
	}
}
