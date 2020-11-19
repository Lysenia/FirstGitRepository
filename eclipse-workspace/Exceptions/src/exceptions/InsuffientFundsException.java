package exceptions;

public class InsuffientFundsException extends RuntimeException {
	
public InsuffientFundsException () {
		
	}
	
public InsuffientFundsException (String message) {
		super(message);
	}


}
