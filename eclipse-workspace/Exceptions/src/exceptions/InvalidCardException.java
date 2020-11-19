package exceptions;

public class InvalidCardException extends Exception{

	public InvalidCardException () {
		
	}
	
public InvalidCardException (String message) {
		super(message);
	}
}
