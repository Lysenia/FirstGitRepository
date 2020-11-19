package bs;

public class AppRunner {
	
	public static void main (String args[]) {
		
		PhoneNumberManagement number1 = new PhoneNumberManagement (2405997745l, "Adam");
		PhoneNumberManagement number2 = new PhoneNumberManagement (2405997745l, "Eve");
		
		
		number1.transformPhoneNumber();
		number2.transformPhoneNumber();
		
		System.out.println("Number for " + number1.getName() + " is " + number1.transformPhoneNumber());
		System.out.println("Number for " + number2.getName() + " is " + number2.transformPhoneNumber());
	

}
}
