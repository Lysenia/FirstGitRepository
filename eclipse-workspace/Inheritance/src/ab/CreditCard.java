package ab;

public class CreditCard extends BankCard {
	
	public CreditCard(String name, long cardNumber, double balance) {
		super(name, cardNumber, balance);
		
	}
	
	public double withdraw(int amount) {
		
		return balance - amount*1.05;
	}

}
