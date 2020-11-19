package tuesday;

public class RowBoat extends Boat{
	int paddLecount;

	public void sail() {
		System.out.println("rowing a boat");
	}
	@Override
	public void move() {
		System.out.println("row boat is moving");
		
	}
	@Override
	public void aFloat() {
		System.out.println("floating a boat");
	}

}
