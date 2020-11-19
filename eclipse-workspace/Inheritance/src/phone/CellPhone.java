package phone;

import constructor.Phone;

public class CellPhone extends Phone {
	
	public CellPhone() {
		super();
		System.out.println("no args constructor");
	}
	
	public CellPhone(String brand, double size) {
		super("iPhone", 4.0);
		
	}
	
	public void makeCallFromCellPhone() {
		makeCall();
		System.out.println("making call from cell phone");
	}
}


