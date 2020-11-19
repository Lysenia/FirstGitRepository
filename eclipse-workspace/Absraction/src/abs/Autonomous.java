package abs;

public interface Autonomous extends Drivable{
	
	public static final boolean HAS_SENSORS = true;
	public abstract void selfDrive();
	
	default public void accellerate() {
		System.out.println("Default acceleration");
	}
	
    public static void selfPark() {
	System.out.println("Staticly self parking");
}
}
