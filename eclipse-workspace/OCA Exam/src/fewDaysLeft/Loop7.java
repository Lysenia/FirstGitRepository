package fewDaysLeft;

public class Loop7 {
	
	public static void main(String args[]) {
		
		int data [] = {20,30,40,50,60,70};
		
		int key = 40;
		int count =0;
		
		for(int f:data) {
		if(f!=key)
			continue;
		count ++;
		}
		
		System.out.println(count);
	}
}
