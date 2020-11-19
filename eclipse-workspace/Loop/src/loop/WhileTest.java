package loop;

import java.util.Scanner;

public class WhileTest {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int sum = 0;
		System.out.println("enter the numbers:");
	
	while (n!=-1) {
			sum+=n;
			n = sc.nextInt();
	}
	System.out.println("Sum" + " " + sum);
	sc.close();
}
}