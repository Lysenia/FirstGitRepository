package accessmodifier;

public class BankAccount {
	
	private int accountNumber;
	private int pin;
	
	void printSomething() {
		
		System.out.println("welcome to capitalOne");
	}
//	getters and setter
	
	public int getAccountNumber(){
		return accountNumber;
	}
	
	public void setAccountNumber(int newNumber) {
		accountNumber =  newNumber;
	}
	
	public int getPin(){
		return pin;
	}
	
	public void setPin(int newPin) {
		pin =  newPin;
	}
}
