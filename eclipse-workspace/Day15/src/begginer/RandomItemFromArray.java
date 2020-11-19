package begginer;

import java.util.Random;

public class RandomItemFromArray {
	public static void main (String args[]) {
		
		Random rc = new Random();
		
		int numbers[] = {14, 12, 17, 1, 8, 9, 34};
	
		int randomNumbers = rc.nextInt(numbers.length);
		System.out.println( numbers [randomNumbers]  );
		

}
}