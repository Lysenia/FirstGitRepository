package fewDaysLeft;

public class Loop6 {
	
	public static void main(String args[]) {
		
		int i=1, j=5;
		
		do {
			if(i++>--j)
				continue;
		}
		while(i<3);
		
		System.out.println(i + "" + j);
	}

}