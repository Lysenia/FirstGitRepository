package fewDaysLeft;

public class Loop8 {
	
	public static void main(String args[]) {
		
		String str[] = { "11","22","33","44","55"};
		
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i] + " ");
			
			if(str[i].equals("44")) {
				continue;
			}
			
			System.out.println("You pass OCA");
			break;
		}
		
	}
}
