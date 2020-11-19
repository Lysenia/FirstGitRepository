package saturday;

import java.util.Scanner;

public class WhileExample {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = 0;
//		while(true) {
//			n = sc.nextInt();
//			if(n>10) {
//				break;
//		}
//		
//		boolean isInputContainNumber = sc.hasNextInt();
//		System.out.println(isInputContainNumber);
		if(!sc.hasNextInt())
			while (!sc.hasNextInt()) 
			{        
			    sc.next(); // Read and discard offending non-int input
			    System.out.print("Please enter an integer: "); // Re-prompt
			}

			// At this point in the code, the user has entered an integer
			int input = sc.nextInt(); // Get the integer

			}
		
		
	}

