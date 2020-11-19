package phone;

import constructor.Phone;

public class LandLine extends Phone {
	
	public LandLine() {
		super();
		System.out.println("no args constructor");
	}
	
	public LandLine(String brand, double size) {
		super("old", 12.0);
		
	}
	
	public void makeCallFromLandLinePhone() {
		makeCall();
		System.out.println("making call from landLine phone");
	}
}
