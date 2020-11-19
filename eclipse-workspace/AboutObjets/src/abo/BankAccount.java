package abo;

public class BankAccount {

	String name;
	long accountNumber;
	double balance;
	
	public void displayCardInfo() {

	System.out.println( name + accountNumber + balance);
	}
	public void deposit(Double addedMoney){
			balance = balance + addedMoney;
	}
	public void withdraw(int withdraw){
		if(balance<withdraw) {
			System.out.println("Sorry, you do not have enough money");
			balance = balance - withdraw;
return;
		}
		

	}
	
	public double getBalance() {
		return balance;
}
	public boolean checkForLowBalance() {
		if(balance<1000) {
		return true;
		}else 
			return false;
	}
	}

