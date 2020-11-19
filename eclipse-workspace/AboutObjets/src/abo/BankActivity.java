package abo;

import java.util.Scanner;

public class BankActivity {
	public static void main(String[] args) {
		
	
		BankAccount account = new BankAccount();
		account.name = "Adam";
		account.accountNumber = 123456789L;
		account.balance = 100000;
		
	
	System.out.println("Welcome to our bank " + account.name);
	
	
	
//account.displayCardInfo();
//account.deposit(100.00);
//System.out.println("Your balance is   " + account.balance);
//account.withdraw(500);
//double newBalance = account.getBalance();
//System.out.println("Your new balance is  " + account.getBalance());
//	
	
	Scanner sc = new Scanner(System.in);

System.out.println("*If you want to deposit, please press 1\n" +
"        *If you want to withdraw, please press 2");

double input = sc.nextDouble();
if (input == 1) {
System.out.println("Please enter the amount in double");
double addedMoney = sc.nextDouble();
account.deposit(addedMoney);

}else if (input == 2){
System.out.println("Please enter the amount, whole numbers only");
int withdraw = sc.nextInt();
account.withdraw(withdraw);
}
else {
System.out.println("Invalid input. Please try again");
}

System.out.println("Your final balance is  " + account.getBalance());

	}
	

	}
	
	


