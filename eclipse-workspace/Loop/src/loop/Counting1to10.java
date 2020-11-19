package loop;

public class Counting1to10 {
	public static void main(String[] args) {
		int i = 1;
		System.out.println("While loop: ");
		
		while(i<=10) {
			System.out.print(i + " ");
			i++;
		}
		
		// executed at least once
		System.out.println();
		System.out.println("Do While loop: ");
		int j =1;
		do {
			System.out.print(j+ " ");
			j++;
		} while (j<=10);
		
		System.out.println();
		System.out.println("For loop: ");
		
		for(int k=1;k>=10;k++) {
			System.out.print(k+ " ");
		}
		
	
}
}