package loop;

import java.util.Scanner;

public class Learning {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your surname:");
		String surname = sc.next();
		

		for (int c=0; c<surname.length();c++) {
			char eachChar = surname.charAt(c);
			System.out.print(eachChar);
			if(c!=surname.length()-1) {
			System.out.print(",");
		}
		}
		
	}
}
