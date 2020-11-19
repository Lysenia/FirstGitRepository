package loop;

public class Palindrom {
public static void main(String[] args) {
		
		System.out.println("Enter the number to check..");
		int number = 0;
		number = 12321;
		
		System.out.println("Number is " + number);
		int n = number;
		int reversedNumber  = 0;
		int temp=0;
				
		//reverse the number
		while(n > 0){
			temp = n % 10;
			n = n / 10;
			reversedNumber = reversedNumber * 10 + temp;
		}
	
		/*
		 * if the number and it's reversed number are same, the number is a 
		 * palindrome number
		 */
		if(number == reversedNumber)
			System.out.println(number + " is a palindrome number");
		else 
			System.out.println(number + " is not a palindrome number");
		}


}
