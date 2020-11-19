package tuesday;

public class SailBoat extends Boat {

	double width;

	public void sail() {
		System.out.println("sailboat is boat");
	}
	@Override
	public void move() {
		System.out.println("boat is moving");
		
	}
	@Override
	public void aFloat() {
		System.out.println("floating a sailboat");
		
	}
	
}
