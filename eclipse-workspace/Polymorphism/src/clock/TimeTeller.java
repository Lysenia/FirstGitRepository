package clock;

public interface TimeTeller {

	boolean CAN_TELL_TIME = true;
	
	default void tellTime() {
		System.out.println("Default time");
	}
	



public static void main(String args[]) {
	
	TimeTeller t = new Clock();
	System.out.println(t.CAN_TELL_TIME);
	t.tellTime();

//	t.runClock - is not accessible;
//  t.k - is not accessible;

	Clock c = new Clock();
	System.out.println(CAN_TELL_TIME);
	c.runClock();
	
}

}
