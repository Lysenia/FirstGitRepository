package overriding;

public class TV extends Electronic {
	
	
	@Override
	public void isOn() {
	super.isOn();
		System.out.println("TurningOn TV");
	}
	
	@Override
	public void isOff() {
		super.isOff();
		System.out.println("TurningOff TV");
	}


}
