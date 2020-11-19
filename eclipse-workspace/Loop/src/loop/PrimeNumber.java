package loop;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int b = 1;
		int c = 0;
		while(b<= number) 
        { 
            if((number%b)==0) 
               c=c+1; 
               b++; 
        } 
         if(c==2) 
         System.out.println(number +" is a prime number"); 
         else 
         System.out.println(number +" is not a prime number");
} 
} 

//		while(number >0) {
//		number++;
//		}
//			if ((number%1 ==0) && (number%number ==0)) {
//			System.out.println("Prime number");
//	}
//		else 
//			System.out.println("Not a prime number");

