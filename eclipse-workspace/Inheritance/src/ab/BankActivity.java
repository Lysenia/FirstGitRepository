package ab;

public class BankActivity {
	
	public static void main (String args[]) {
		
		DebitCard d = new DebitCard("Adam",12345L,300);
		System.out.println(d.withdraw(100));
		
		CreditCard c = new CreditCard("Eve",3456L,500);
		System.out.println(c.withdraw(300));
		
		
	}

}
