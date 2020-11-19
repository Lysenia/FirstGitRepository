package overriding;

public class Electronic {
	
	public boolean isOn;
	
	
	
	
	public void isOn() {
		this.isOn = true;
		System.out.println("Electronic is turnedOn");
	}
	
	public void isOff() {
		this.isOn = false;
		System.out.println("Electronic is turnedOff");
	}

}
