package fewDaysLeft;

public class Loop5 {
	
	public static void main(String args[]) {
		
		int c = 0;
		OUTER: while (c<5) {
			INNER: System.out.println(c);
			if(c>2) break OUTER;
			
			else c++;
		}
		
	}

}
