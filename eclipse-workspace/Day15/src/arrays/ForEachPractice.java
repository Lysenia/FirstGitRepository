package arrays;

public class ForEachPractice {
	public static void main(String[] args) {
		
double [] prices = {1.1, 2.40, 5.50, 6.60, 8.0};
double sum = 0; 
double avg = 0;
	
	for(double item: prices) {
		sum +=item;
		avg = sum/item;
	}
			System.out.println( sum + " ");
			System.out.print( avg + " ");

}
}
