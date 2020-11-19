package inheritance;

public class Latin extends Language{
	
	public static void main (String args[]) {
		
		Latin latin = new Latin();
		latin.firstAlphabet = 'A'; //public
		latin.pronounciation = "good"; //protected
		
		latin.numberOfUsers = 80000L; //default
		
	}

}
