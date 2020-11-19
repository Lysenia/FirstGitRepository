package exceptions;

public class InvalidPinCodeException extends RuntimeException{
	
public InvalidPinCodeException () {
		
	}
	
public InvalidPinCodeException (String message) {
		super(message);
	}
}


