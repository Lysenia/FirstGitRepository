package sunday_Murodil;

import java.util.ArrayList;

public class TestSum {

	public static void main (String args[]) {
		
		Sum sum = new Sum();
		
		if (sum.sumItUp(10, 50)==60) {
			System.out.println("Pass: sum (int,int) working as expected");
		}
		else {
			System.out.println("Fail: sum (int,int) is not working as expected");
		}
		
		if(sum.sumItUp(5, 6, 7) == 18) {
			System.out.println("Pass: sum (int,int,int) working as expected");
	}
	else {
		System.out.println("Fail: sum (int,int,int) is not working as expected");
	}
		
		int intsArray[] = {10,20,30,40,50};
		if(sum.sumItUp(intsArray)==150) { System.out.println("Pass: sum (int []) working as expected");
	}
	else {
		System.out.println("Fail: sum (int[]) is working as expected");
	}
		
		ArrayList<Integer> numList = new ArrayList<>();
		numList.add(5);
		numList.add(10);
		numList.add(15);
		
		if(sum.sumItUp(numList)==30) System.out.println("Pass: sum (ArrayList<Integer>) working as expected");
	
	else {
		System.out.println("Fail: sum (ArrayList<Integer>) is not working as expected");
	}
		
	
}
}