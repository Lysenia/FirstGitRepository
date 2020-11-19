package go;

//Test 17

public class CheckingAccount {
	public int amount;
	
	public CheckingAccount(int amount) {
		this.amount=amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void changeAmount(int x) {
		amount +=x;
		
	}


public static void main (String args[]) {
	CheckingAccount acct = new CheckingAccount((int)Math.random()*1000);
acct.changeAmount(-acct.amount);
acct.amount=0;
acct.changeAmount(0);
	System.out.println(acct.getAmount());
}
}
