package arrays;

public class ArraySum {
	public static void main(String[] args) {
		int numbers [] = new int [] {80, 20, 30, 40, 50, 60, 10};
		int sum = 0;
		int multiple = 1;
		

		for (int i =0; i<numbers.length; i++) {
			if(numbers[i]>=10) 
				sum += numbers[i];
				if( ((numbers[i]%2 ==0) && (numbers[i]%3 ==0))){
					multiple = multiple *numbers[i];
			

}
			
		}
		System.out.println("sum" + " " + sum);
		System.out.println( "Result is" +  " " + multiple);
		int max = numbers[0];
		for (int j = 1; j<numbers.length; j++) {
			if (numbers[j]>max) {
				max = numbers[j];
			}
		}
int min = numbers[0];
for (int i = 0; i<numbers.length; i++) {
if (numbers[i]<min) {
min = numbers[i];
			}
		}
		System.out.println("max" + " " + max);
		System.out.println("min" + " " + min);
	}
}
