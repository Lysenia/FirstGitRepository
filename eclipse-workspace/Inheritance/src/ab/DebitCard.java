package ab;

public class DebitCard extends BankCard{

	
	public DebitCard(String name, long cardNumber, double balance) {
		super(name, cardNumber, balance);
		
	}
	
	public double withdraw(int amount) {
		
		return balance - amount*1.05;
	}

	
	
}
