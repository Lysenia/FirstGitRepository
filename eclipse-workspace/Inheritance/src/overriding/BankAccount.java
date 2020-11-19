package overriding;

public class BankAccount {
	
	String name;
	int accountNumber;
	double balance;
	
	public BankAccount(String name, int accountName, double balance) {
		this.name = name;
		this.accountNumber = accountName;
		this.balance = balance;
	}
	
	public double withdraw(int amount) {
		return balance - amount;
	}


}
