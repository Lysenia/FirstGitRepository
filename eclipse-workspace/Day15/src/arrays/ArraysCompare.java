package arrays;

public class ArraysCompare {

	public static void main (String args[]) {
		
		String [] box1 = {"apples", "bananas", "carrots"};
		String [] box2 = {"bananas", "strawberries", "apples","kiwis", "carrots"};
		
		
		for (String fruit1: box1) {
			boolean found = false;
			for (String fruit2: box2) {
				if(fruit1.equals(fruit2)){
				found = true;
				break;
					
				}
			}
			if (found) {
				System.out.println(fruit1 + "  is in box 2");
			}else{
					System.out.println(fruit1 + "  is not in box 2");
				}
			}
		}
		
	}
