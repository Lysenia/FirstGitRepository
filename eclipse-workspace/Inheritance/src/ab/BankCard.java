package ab;

public abstract class BankCard {
	
	String name;
	long cardNumber;
	double balance;
	
	public BankCard(String name, long cardNumber, double balance) {
		super();
		this.name = name;
		this.cardNumber = cardNumber;
		this.balance = balance;
	}

	
	public BankCard() {
		
	}

	
	public abstract double withdraw(int amount);
	
	public double deposit(double d) {
		double deposit =  this.balance+d;
		return deposit;
	}
	

}
