package arrays;

public class MultiArray {

	public static void main (String args[]) {
		
		String name [] = {"Adam", "Eve", "Pole", "Lucie", "John"};
		
		LABEL1:
		
		for(int i=0; i<name.length; i++) {
			
			char[] nameChar = name[i].toCharArray();
			LABEL2:
			for(int j=0; j<nameChar.length; j++) {
//				if(nameChar[j]=='o') {
//					break LABEL1;
//				}
				
				if(nameChar[j]=='e') {
					System.out.println();
					continue LABEL2;
				}
				System.out.print(nameChar[j] + " ");
			}
			System.out.println();
		}
		
	}
}
