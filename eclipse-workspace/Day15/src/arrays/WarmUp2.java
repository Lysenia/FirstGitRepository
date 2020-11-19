package arrays;

public class WarmUp2 {
	public static void main(String[] args) {
		
		int numbers [] = {2, 3, 5, 8, 5, 12, 10, 3, 12, 100};
		int count = 0;
		for (int i =0; i<numbers.length; i++) {
			if (numbers[i] >5 && numbers[i]<10  ) {
					count++;
				
			}
		}
	
			System.out.println("There is" + count + "numbers between 5 and 10");
	}
}
