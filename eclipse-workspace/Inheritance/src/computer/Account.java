package computer;

public class Account {

	private String name;
	private int accountNumber;
	
	
	public String getName() {
		return name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	
	public Account(String name, int accountNumber) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
	}
	
	
}
