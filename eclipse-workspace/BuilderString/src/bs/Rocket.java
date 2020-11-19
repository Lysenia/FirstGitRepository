package bs;

public class Rocket {
	
//	static method can not have any instance members;
//	Instance method can have both instance and static members;

	private int power;
	private String name;
	private int numberOfEngine;
	private boolean readyForLunch;
	
	static int counter =0;
	static String LounchPad = "Cybertek Launchpad";
	
	public Rocket(int power, String name, int numberOfEngine, boolean readyForLunch) {
		super();
		this.power = power;
		this.name = name;
		this.numberOfEngine = numberOfEngine;
		this.readyForLunch = readyForLunch;
		counter++;
	}
	
	public void lounch() {
		System.out.println("Lounching" + toString());
		
	}
	
	
	public String toString() {
		return "Rocket [power=" + power + ", name=" + name + ", numberOfEngine=" + numberOfEngine + ", readyForLunch="
				+ readyForLunch + "]";
	}
	
	
	public static void capsulate() {
		System.out.println("reducing the weight");
		counter--;
	}
	
	
	
	
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberOfEngine() {
		return numberOfEngine;
	}
	public void setNumberOfEngine(int numberOfEngine) {
		this.numberOfEngine = numberOfEngine;
	}
	public boolean isReadyForLunch() {
		return readyForLunch;
	}
	public void setReadyForLunch(boolean readyForLunch) {
		this.readyForLunch = readyForLunch;
	}
	
	
	
	
	
}
