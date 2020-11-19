package clock;

public class Clock implements TimeTeller{

	boolean CAN_TELL_TIME = false;
	int k = 10;
	
	void runClock() {
		System.out.println("tik-tak");
	}
	
	@Override
	public void tellTime() {
		System.out.println("clock is telling time");
		
	}

}
