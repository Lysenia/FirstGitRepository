package abs;

public class Main {

	public static void main (String args[]) {
		
		Tesla tesla = new Tesla();
		Honda honda = new Honda();
		
		tesla.start();
		tesla.accellerate();
		tesla.selfDrive();
	
		Autonomous.selfPark();
		System.out.println(tesla.HAS_SENSORS);
		
	}
}
