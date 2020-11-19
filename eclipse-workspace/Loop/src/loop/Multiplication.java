package loop;

import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		
		int n = 1 + (int)(Math.random()*100);
		System.out.println("n=" + n);
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter your guess:" );
			int guess = sc.nextInt();
			if(guess == n) {
				break;
			}
		if(guess<n) {
			System.out.println("Too small" );
		}
		else {
			System.out.println("Too big" );
		}
		}
		System.out.println("Great job" );
	}
}
