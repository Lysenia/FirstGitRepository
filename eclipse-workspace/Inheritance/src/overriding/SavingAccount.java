package overriding;

public class SavingAccount extends BankAccount{

	public SavingAccount(String name, int accountName, double balance) {
		super(name, accountName, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double withdraw(int amount) {
//		return (int) balance - (amount*1.05);  
//		return Double.valueOf("123"); wrapper Object also work
return new Double("134");
	}

	
	public static void main(String args[]) {
		
		BankAccount b=new BankAccount("muhtar",1000,12345);
		System.out.println(b.withdraw(10));
		
		SavingAccount s = new SavingAccount("mattursun",100000,12321);
		System.out.println(s.withdraw(100));
	}

	}
	

